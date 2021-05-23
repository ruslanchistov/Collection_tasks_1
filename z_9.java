//Дано трехзначное число. Определить:
//а) верно ли, что все его цифры одинаковые;
//б) есть ли среди его цифр одинаковые.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_9 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное трёхзначное число: ");
        n = in.nextInt();
        if (n % 111 == 0) {
            System.out.println("Все цифры одинаковые.");
        } else {
            if (n / 100 == n % 10 || n / 100 == n % 100 / 10 || n % 10 == n % 100 / 10) {
                System.out.println("Две цифры одинаковые.");
            } else {
                System.out.println("Нет одинаковых цифр.");
            }
        }
    }
}
