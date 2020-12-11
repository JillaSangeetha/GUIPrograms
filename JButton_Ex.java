import javax.swing.*;
public class JButton_Ex {
    public static void main(String args[]){
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("click here");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);


    }
}
