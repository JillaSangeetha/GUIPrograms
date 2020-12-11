/*it is an example of  event handling in JApplet*/
import java.applet.*;
import  javax.swing.*;
import java.awt.event.*;

public class JApplet_Ex extends JApplet implements ActionListener {

    JButton b;
    JTextField tf;

    public void init() {

        tf = new JTextField();
        tf.setBounds(30, 40, 150, 20);
        b = new JButton("CLick");
        b.setBounds(80, 150, 70, 40);
       add(b);
       add(tf);
       b.addActionListener(this);
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       tf.setText("welcome");
    }


}
       
