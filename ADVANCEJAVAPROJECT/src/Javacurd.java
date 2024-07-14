import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

public class Javacurd {
    private JPanel Main;
    private JTextField textpname;
    private JTextField textprice;
    private JButton SAVEButton;
    private JButton DELETEButton;
    private JButton RESETButton;
    private JTextField textpid;
    private JTextField textqty;
    private JButton searchButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Curd");
        frame.setContentPane(new Javacurd().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
//changes
        frame.setSize(700,700);

        frame.setResizable(false);
    }

    Connection con;
    PreparedStatement pst;

    public Javacurd() {

        Connect();
        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String pname, price, qty;
                pname = textpname.getText();
                price = textprice.getText();
                qty = textqty.getText();
                try {

                    pst = con.prepareStatement("insert into regestration(pname,price,qty)values(?,?,?)");
                    pst.setString(1, pname);
                    pst.setString(2, price);
                    pst.setString(3, qty);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "RECORD ADDED....");

                    textpname.setText("");
                    textprice.setText("");
                    textqty.setText("");
                    textpname.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String pid = textpid.getText();
                    pst = con.prepareStatement("select pname,price,qty from regestration where pid=?");
                    pst.setString(1, pid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()==true) {
                        String name = rs.getString(1);
                        String price = rs.getString(2);
                        String qty = rs.getString(3);

                        textpname.setText(name);
                        textprice.setText(price);
                        textqty.setText(qty);


                    } else {

                        textpname.setText("");
                        textprice.setText("");
                        textqty.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Productid");
                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });


        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pname,price,qty,pid;
                pname=textpname.getText();
                price=textprice.getText();
                qty=textqty.getText();
                pid= textpid.getText();
                try{


                        pst = con.prepareStatement("update regestration set pname=?,price=?,qty=? where pid=?");
                        pst.setString(1,pname);
                        pst.setString(2,price);
                        pst.setString(3,qty);
                        pst.setString(4,pid);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Record Udated");
                        textpname.setText("");
                        textprice.setText("");
                        textqty.setText("");
                        textpname.requestFocus();
                        textpid.setText("");

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pid;
                pid=textpid.getText();
                try {
                    pst= con.prepareStatement("DELETE FROM `regestration` WHERE `regestration`.`pid` = ?");
                    pst.setString(1,pid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"REcord deleted");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost / javaproject ","root","");
            System.out.println("Connected Successfully");
        } catch (ClassNotFoundException | SQLException ep) {
            ep.printStackTrace();
        }
    }
}

