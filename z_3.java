//Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему
//слово "копейка" в правильной форме. Например, 1 копейка, 5 копеек, 42 копейки .

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_3 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  число от 1 до 99: ");
        n = in.nextInt();
        func(n);
    }
    static void func(int n) {
        if (n % 10 == 1) {
            System.out.println(n + " копейка ");
            return;
        }
        if (n % 10 > 1 && n % 10 < 5) {
            System.out.println(n + " копейки ");
            return;
        }
        if (n % 10 > 4 || n % 10 == 0) {
            System.out.println(n + " копеек ");
            return;
        }
    }


}
