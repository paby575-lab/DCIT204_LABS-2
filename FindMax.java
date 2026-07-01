import java.util.Scanner;

public class FindMax {

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

        // Assume the first element is the maximum
        int max = numbers[0];
        int index = 0;

        // Find the maximum value and its index
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }

        // Display the results
        System.out.println("\nResults");
        System.out.println("--------------------");
        System.out.println("Maximum value: " + max);
        System.out.println("Index of maximum value: " + index);

        input.close();
    }
}
