package addForm;

import javax.swing.*;
import java.awt.*;

public class AddForm extends JFrame {
    JLabel lblroll, lblname,lbllevel,lblfaculty,lblsem;
    JTextField txtroll, txtname;
    JComboBox cblevel,cbfaculty,cbsem;
    JButton btnsave;

    public AddForm(){

        lblroll=new JLabel("enter roll");
        lblname=new JLabel("enter name");
        lbllevel=new JLabel("enter lavel");
        lblfaculty=new JLabel("enter faculty");
        lblsem=new JLabel("enter semester");
        btnsave=new JButton();

        txtroll=new JTextField();
        txtname=new JTextField();

        cblevel=new JComboBox();
        cblevel.addItem("+2");
        cblevel.addItem("Bachelor");
        cblevel.addItem("Master");
        cblevel.addItem("Phd");

        cbfaculty=new JComboBox();
        cbfaculty.addItem("science");
        cbfaculty.addItem("Managment");
        cbfaculty.addItem("Education");
        cbfaculty.addItem("BBA");

        cbsem=new JComboBox();
        cbsem.addItem("1st");
        cbsem.addItem("2nd");
        cbsem.addItem("3rd");

        add(lblroll);
        lblroll.setBounds(20, 20, 100, 25);
        add(txtroll);
        add(lblname);
        lblname.setBounds(120, 20, 100, 25);
        add(txtname);
        add(lbllevel);
        lbllevel.setBounds(20, 60, 100, 25);
        add(lblfaculty);
        lblfaculty.setBounds(120, 60, 100, 25);
        add(lblsem);
        lblsem.setBounds(20, 100, 100, 25);
        add(cbsem);
        cbsem.setBounds(120, 100, 100, 25);
        add(cbfaculty);
        cbfaculty.setBounds(20, 140, 100, 25);
        add(cblevel);
        cblevel.setBounds(120, 140, 100, 25);

        add(btnsave);
        btnsave.setBounds(20, 180, 100, 25);

        setVisible(true);
        setResizable(false);


    }
}
