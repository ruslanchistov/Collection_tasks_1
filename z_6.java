//Дано целое число от 1 до 365. Определить, какой день недели выпадает на это число, если
//1 января – понедельник.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_6 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  число от 1 до 365: ");
        n = in.nextInt();
        String[] days = {"воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота"};
        System.out.println(" Это " + days[n % 7]);
    }
}
