import PetriNet.PetriNet;
import javax.swing.JFrame;
public class Main {
  public static void main(String[] args) {
    new Runnable() {
      @Override
      public void run() {
        new PetriNet().setVisible(true);
      }
    }.run();
  }
}
