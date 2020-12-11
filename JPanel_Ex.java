import java.awt.*;
import javax.swing.*;
public class JPanel_Ex {
JPanel_Ex()
 {
     JFrame f = new JFrame("panel example");
     JPanel p=new JPanel();
     p.setBounds(40,80,200,200);
     p.setBackground(Color.lightGray);
     JButton b1=new JButton("button1");
     b1.setBounds(50,100,80,30);
     b1.setBackground(Color.yellow);
     JButton b2=new JButton("button2");
     b2.setBounds(100,100,80,30);
     b2.setBackground(Color.pink);
     p.add(b1);
     p.add(b2);
     f.add(p);
     f.setSize(400,400);
    // f.setLayout(new FlowLayout());
     f.setLayout(null);
     f.setVisible(true);
 }

  public static void main(String args[]){
    new JPanel_Ex();
  }

}
