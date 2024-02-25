import javax.swing.JFrame;
public class GameFrame extends JFrame {
    //create a constructor
    GameFrame(){
// 2nd way create an instance
this.add(new GAmepanel());
this.setTitle("Snake");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.pack();
this.setVisible(true);
this.setLocationRelativeTo(null);
    }
}
