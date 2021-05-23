//Дано натуральное четырехзначное число. Выяснить, является ли оно палиндромом
//(читается одинаково слева направо и справа налево).

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное четырехзначное число: ");
        n = in.nextInt();
        if((n/1000 == n%10)&&(n%1000/100 == n%100/10)){
            System.out.println("Число является полиндромом.");
        }
        else{
            System.out.println("Число не является полиндромом.");
        }
    }
}
