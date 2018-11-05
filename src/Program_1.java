import java.util.Scanner;

public class Program_1 {

    public static void main(String args[]) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Średnica = ");
        number = scanner.nextInt();

        double result;

        if(number >= 160) {
            result = (number / 2) * 3.14 * 2;
            System.out.println("Wycinanie frezem z wymiarem = " + result + " (kod obróbki 266)");
        } else {
            System.out.println("Użyj obróbki CO wycięcie inne do 500 mm (kod obróbki 294)");
        }
    }
}
