//Дано двухзначное число. Определить:
//        а) входит ли в него цифра 5;
//        б) входит ли в него цифра а.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_1 {
        public static void main(String[] args) {
                int n;
                Scanner in = new Scanner(System.in);
                System.out.print("Введите двухзначное число :");
                n = in.nextInt();
                System.out.print("Введите цифру a: ");
                int a;
                a = in.nextInt();
                if(n/10 ==5 || n%10 == 5){
                        System.out.println("В этом числе есть цифра пять");
                }
                else{System.out.println("В этом числе нет цифры пять");}
                if(n/10 ==a || n%10 == a){
                        System.out.println("В этом числе есть цифра "+a);
                }
                else{System.out.println("В этом числе нет цифры "+a);}
        }
}
