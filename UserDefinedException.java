import java.util.Scanner;

public class UserDefinedException {
    private static class ValueLimitException extends Exception {
        ValueLimitException(String message) {
            super(message);
        }
    }

    private static void checkValue(int value, int limit) throws ValueLimitException {
        if (value > limit) {
            throw new ValueLimitException("Value greater than limit");
        }
    }

    public static void main(String[] args) {
        int limit = 100;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a value: ");
            try {
                if (!scanner.hasNextInt()) {
                    throw new ValueLimitException("Enter an int");
                }

                int value = scanner.nextInt();
                checkValue(value, limit);
                System.out.println("Value is within the limit.");
            } catch (ValueLimitException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
