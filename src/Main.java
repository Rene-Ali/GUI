import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Your height is " + height);

        JOptionPane.showMessageDialog(null, "Now we are calculating the hypotenuse with your figures");

        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter X"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter Y"));

        double z = Math.sqrt((x*x)+(y*y));

        JOptionPane.showMessageDialog(null, "The hypotenuse is " + z);




    }
}