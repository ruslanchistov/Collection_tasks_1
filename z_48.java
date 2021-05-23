//Дан массив фамилий студентов 1-го курса и массив их результатов в беге на 100 метров.
//Составьте команду из четырех лучших бегунов для участия в эстафете.

        package zadachnic_2.zadachi_1_66;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
public class z_48 {
    public static void main(String[] args) {
        String[] surname = new String []{"Иванов","Петров","Сидоров","Мокин","Васечкин","Гусев","Сыроежкин","Плотнов","Смирнов","Овечкин","Бобриков","Куролесов","Баев","Мусин","Ковалёв","Журавлёв","Платонов","Коклин","Буранов","Фёдоров"};
        double [] result = new double[surname.length];
        result=setResult(result);
        System.out.println(Arrays.toString(surname));
        System.out.println(Arrays.toString(result));
        bestResult(result,surname);

    }
    static double[] setResult(double[]result){  //заполняем массив результатов
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i]= Math.ceil(((random.nextDouble()*10)+5)*100)/100 ;
        }
        return result;
    }

    static void bestResult(double[]result,String[]surname){ //определяем четырёх лучших студентов
        String cur_surname;
        double cur_result;
        for (int i = 0; i < 4; i++) {
            double best_result = result[i];
            int index = i;
            for (int j = i; j < result.length; j++) {
                if(best_result>result[j]){
                    best_result=result[j];
                    index=j;
                }
            }
            System.out.println(surname[index]+" result "+best_result+" sec");

            //  меняем местами текущую фамилию с фамилией лучшего студента
            cur_surname=surname[index];
            surname[index]=surname[i];
            surname[i]=cur_surname;

            //  меняем местами текущий результат с лучшим
            cur_result=result[index];
            result[index]=result[i];
            result[i]=cur_result;
        }
    }
}
