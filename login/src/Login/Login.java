package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame implements ActionListener {
    Label lbluser, lblpass;
    TextField txtuser, txtpass;
    Button btnLogin, btnReset;


    public Login() {
        //setLayout(new FlowLayout());
        setTitle("student Login");
        setResizable(false);
        setLayout(null);
        lbluser = new Label("username");
        lblpass = new Label("password");
        txtuser = new TextField();
        txtpass = new TextField();
        btnLogin = new Button("Login");
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
        } else {
            JOptionPane.showMessageDialog(null, "Login Fail");
        }

    }
}
