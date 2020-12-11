import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDialog_Ex {
private static JDialog  d;
JDialog_Ex(){
    JFrame f=new JFrame();
    d=new JDialog(f,"Dialog Example",true);
    d.setLayout(new FlowLayout());
    JButton b=new JButton("OK");
    b.addActionListener(new ActionListener()
                        {
        @Override
        public void actionPerformed(ActionEvent e) {
            JDialog_Ex.d.setVisible(false);
        } //true=action performs(click ok) also dialog not close vice versa to false
                          }
    );
    /*
    d.add(new JLabel("click button to continue"));
     JLabel.setBackground(Color.BLUE);
      */
    d.add(b);
    d.setSize(300,300);

    d.setVisible(true);

}
    public static void main(String[] args)
    {
    new JDialog_Ex();
    }

}
