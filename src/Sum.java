/*
создать метод, который принимает массив и выдает массив логических элементов.
каждый элмент выходного массива показывает, равно ли соответствующее число в массиве сумме двух предидущих.
 */
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = {1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {

//put your code here
        boolean[] result = new boolean[array.length];
        for (int i = 2; i < array.length; i++) {
            if (array[i - 1] + array[i - 2] == array[i]) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}