package Login;

import addForm.AddForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel lbluser, lblpass;
    JTextField txtuser, txtpass;
    JButton btnLogin, btnReset;


    public Login() {
        //setLayout(new FlowLayout());
        setTitle("student Login");
        setResizable(false);
        setLayout(null);
        lbluser = new JLabel("username");
        lblpass = new JLabel("password");
        txtuser = new JTextField();
        txtpass = new JTextField();
        btnLogin = new JButton("Login");
        add(lbluser);
        lbluser.setBounds(20, 50, 100, 25);
        add(txtuser);
        txtuser.setBounds(120, 50, 100, 25);
        add(lblpass);
        lblpass.setBounds(20, 100, 100, 25);
        add(txtpass);
        txtpass.setBounds(120, 100, 100, 25);
        add(btnLogin);
        btnLogin.setBounds(120, 150, 100, 25);
        btnLogin.addActionListener(this);
        setSize(300, 300);
        setResizable(false);
        setLocation(600, 600);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {

        String user = "alex";
        String pwd = "alex123";
        if (user.equals(txtuser.getText().toString()) &&
                pwd.equals(txtpass.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Login success");
            new MainForm();
            new AddForm();
        } else {
            JOptionPane.showMessageDialog(null, "Login Fail");
        }

    }
}
