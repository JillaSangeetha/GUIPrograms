import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class JFrame_Ex {
    public static void main(String[] args){
        JFrame jf=new JFrame("it is jframe");
        JPanel jp=new JPanel();
        jp.setLayout(new FlowLayout());
         JLabel jl=new JLabel("it is Jlabel");
        System.out.println();
        JButton jb=new JButton("it is jbutton");

        jp.add(jl);
        System.out.println();
        jp.add(jb);
        jf.add(jp);
        jf.setSize(300,300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
}
