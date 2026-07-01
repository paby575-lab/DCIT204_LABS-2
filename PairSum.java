import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        // Create the array
        int[] numbers = new int[size];

        // Read the array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Ask for the target sum
        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;

        // Brute-force search for a pair
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {

                    System.out.println("\nPair Found!");
                    System.out.println("Index 1: " + i);
                    System.out.println("Index 2: " + j);
                    System.out.println("Value 1: " + numbers[i]);
                    System.out.println("Value 2: " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found that adds up to the target sum.");
        }

        input.close();
    }
}
