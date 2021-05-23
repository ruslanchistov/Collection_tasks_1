//Рейтинг бакалавра заочного отделения при поступлении в магистратуру определяется
//средним баллом по диплому, умноженным на коэффициент стажа работы по
//специальности, который равен: нет стажа – 1, меньше 2 лет – 13, от 2 до 5 лет – 16.
//Составить программу расчета рейтинга при заданном среднем балле диплома (от 3 до 5) и
//вывести сообщение о приеме в магистратуру при проходном балле 45.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_10 {
    public static void main(String[] args) {
        int mark;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  средний балл диплома: ");
        mark = in.nextInt();
        System.out.print("Введите стаж работы: ");
        int experience;
        experience = in.nextInt();
        int coefficient = 1;
        if(experience == 0){
            coefficient = 1;
        }
        if(experience > 0 && experience < 2){
            coefficient = 13;
        }
        if(experience >=2 && experience <=5){
            coefficient = 16;
        }
        else{
            System.out.println("У Вас стаж больше пяти лет, Вам пора отдыхать :)");
        }
        if(mark*coefficient >=45){
            System.out.println("Поздравляем ! Вы приняты в магистратуру.");
        }
        else{
            System.out.println("Извините, в магистратуру Вы не попали.");
        }
    }
}
// Не совсем понятно это задание, поэтому такое решение.