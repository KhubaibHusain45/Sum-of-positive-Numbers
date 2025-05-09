import java.util.Scanner;

public class SumPositiveNum {
    public static void main(String[] args) {
        sumPositiveNum();
    }

    public static void sumPositiveNum() {
        Scanner inputNum = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter the number(0 to exit program): ");
            number = inputNum.nextInt();
            if (number > 0) {
                sum += number;
            } else {
                continue;
            }
        } while (number != 0);
        System.out.println("Sum is: " + sum);
    }
}
