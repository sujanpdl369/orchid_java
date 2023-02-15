package Login;

import addForm.AddForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu mnuro, mnure, mnuhlp;
    JMenuItem miadd, miedit, midel, miindv, miall, miabt, miexit;

    public MainForm() {
        mb = new JMenuBar();
        mnuro = new JMenu("Report Operation");
        mnure = new JMenu("Report");
        mnuhlp = new JMenu("help");
        miadd = new JMenu("Add New Record");
        miedit = new JMenu("Edit  Record");
        midel = new JMenu("Delet  Record");
        miindv = new JMenu("individual Record");
        miall = new JMenu("All Record");
        miabt = new JMenu("abt Record");
        miexit = new JMenu("exit");
        // adding manu in menu bar
        setJMenuBar(mb);
        mb.add(mnuro);
        miadd.addActionListener(this);
        mb.add(mnure);
        mb.add(mnuhlp);
        //     Adding menuiteams to menu

        mnuro.add(miadd);
        mnuro.add(miedit);
        mnuro.add(midel);
        mnuro.add(miexit);
        mnure.add(miindv);
        mnure.add(miall);
        mnuhlp.add(miabt);
        Dimension scrSize=Toolkit.getDefaultToolkit().getScreenSize();
        setSize(scrSize);

        setVisible(true);
        setSize(scrSize);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==miadd) {
            new AddForm();

        }
        }

}

