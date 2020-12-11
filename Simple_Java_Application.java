import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class Simple_Java_Application extends JFrame
{
    public Simple_Java_Application() {
        setTitle("simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String args[]){
        Simple_Java_Application ex=new Simple_Java_Application();
        ex.setVisible(true);
    }

}

