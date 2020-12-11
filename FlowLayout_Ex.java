

import javax.swing.*;
import java.awt.*;
public class FlowLayout_Ex {
    FlowLayout_Ex(){
       JFrame f  =new JFrame();
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");

        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(new FlowLayout(4,10,10));
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new FlowLayout_Ex();
    }



}
