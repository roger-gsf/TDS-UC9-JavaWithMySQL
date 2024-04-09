package interfaceexercises;

import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a positive integer:");

        try {
            int number = Integer.parseInt(input);

            if (number == 0) {
                System.out.println("There are no divisors of the number 0.");
                return;
            }

            if (number < 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            System.out.println("Divisors of " + number + " are:");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
