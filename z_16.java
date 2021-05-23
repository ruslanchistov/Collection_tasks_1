//Дан массив, состоящий из 12 двоичных чисел. Удалить элементы, которые встречаются
//более двух раз.

package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class z_16 {

        public static void main(String[] args) {
           Integer[] arr = {0b100,0b11,0b1010,0b11,0b111,0b10,0b111,0b101,0b10101,0b10,0b1,0b11};

            getArray(arr);
            Set<Integer> set_ = new LinkedHashSet<Integer>(Arrays.asList(arr));//преобразуем массив в множество

            Integer [] new_arr = set_.toArray(new Integer [set_.size()]);//преобразуем множество в массив
            getArray(new_arr);
        }
        static void getArray(Integer[] arr) {
            for(Integer i: arr){
            System.out.print(Integer.toBinaryString((Integer) i)+" ");
        }
            System.out.println();
        }

}
