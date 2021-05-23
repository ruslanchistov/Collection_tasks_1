//Ввести два массива действительных чисел, состоящих из 7 и 9 элементов. Сформировать
//третий массив из упорядоченных по убыванию значений обоих массивов.

        package zadachnic_2.zadachi_1_66;

import java.util.*;


public class z_15 {
        public static void main(String[] args) {
                Double[] arr1 = new Double[7];
                Scanner in = new Scanner(System.in);
                for (int i = 0; i < 7; i++) {
                        System.out.print("Введите " + i + " -й элемент 1 массива действительное число :");
                        arr1[i] = in.nextDouble();
                }
                getArray(arr1);

                Double[] arr2 = new Double[9];
                for (int i = 0; i < 9; i++) {
                        System.out.print("Введите " + i + " -й элемент 2 массива действительное число :");
                        arr2[i] = in.nextDouble();
                }
                getArray(arr2);
                Double[] arr3 = new Double [16];
                System.arraycopy(arr1,0,arr3,0,arr1.length);
                System.arraycopy(arr2,0,arr3,7,arr2.length);
                Arrays.sort(arr3,Collections.reverseOrder());
                System.out.println("Результат");
                getArray(arr3);
        }

        static void getArray(Double[] arr){
                System.out.println(Arrays.toString(arr));
        }
}
