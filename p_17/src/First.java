import java.util.Scanner;
//Исключение будет выдано в
//том случае, если введен недействительный ИНН
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            if (isValidINN(inn)) {
                System.out.println("Номер ИНН действителен. Заказ оформлен для: " + fullName);
                // остальная логика обработки заказа
            } else {
                throw new Exception("Недействительный номер ИНН");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static boolean isValidINN(String inn) {
        if (inn.length() != 10 && inn.length() != 12) {
            return false;
        }

        try {
            long num = Long.parseLong(inn);
        } catch (NumberFormatException e) {
            return false;
        }

        if (inn.length() == 10) {
            return checkINN10Digits(inn);
        } else {
            return checkINN12Digits(inn);
        }
    }

    private static boolean checkINN10Digits(String inn) {
        int[] coeffs = {2, 4, 10, 3, 5, 9, 4, 6, 8}; //3803300254
        int controlSum = 0;

        for (int i = 0; i < 9; i++) {
            controlSum += Character.getNumericValue(inn.charAt(i)) * coeffs[i];
        }

        int remainder = controlSum % 11;
        if (remainder == 10) {
            remainder = 0;
        }

        int expectedCheckDigit = Character.getNumericValue(inn.charAt(9));

        return remainder == expectedCheckDigit;
    }

    private static boolean checkINN12Digits(String inn) {
        int[] coeffs1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coeffs2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int controlSum1 = 0;
        int controlSum2 = 0;

        for (int i = 0; i < 10; i++) {
            controlSum1 += Character.getNumericValue(inn.charAt(i)) * coeffs1[i];
            controlSum2 += Character.getNumericValue(inn.charAt(i)) * coeffs2[i];
        }

        int remainder1 = controlSum1 % 11;
        if (remainder1 == 10) {
            remainder1 = 0;
        }

        int remainder2 = controlSum2 % 11;
        if (remainder2 == 10) {
            remainder2 = 0;
        }

        int expectedCheckDigit1 = Character.getNumericValue(inn.charAt(10));
        int expectedCheckDigit2 = Character.getNumericValue(inn.charAt(11));

        return remainder1 == expectedCheckDigit1 && remainder2 == expectedCheckDigit2;
    }
}