
package salesgenerator;

/**
 *
 * @author nadeen
 */
public class Main {

    public static void main(String args[]) {
        MyFrame frame = new MyFrame();
        Listeners listener = new Listeners(frame);

        frame.setTitle("sales generator");
        frame.setVisible(true);
    }

}
