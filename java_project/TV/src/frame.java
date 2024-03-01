import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class frame extends JFrame {

    frame(){
        this.setSize(420,420);
        this.setTitle("TV");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x7654321));
    }

}

class Lable extends JLabel{
    Border border = BorderFactory.createLineBorder(new Color(0x24681012),3);
    Lable(){
       this.setText("hello, world");
       this.setFont(new Font("Serif",Font.BOLD,20));
       this.setForeground(new Color(0xfffffff));
       this.setHorizontalAlignment(JLabel.CENTER);
       this.setVerticalAlignment(JLabel.CENTER);
       this.setBorder(border);
    }
}