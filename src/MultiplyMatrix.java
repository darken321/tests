import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * а число столбцов равно числу столбцов второй матрицы.
 * Перейдите в класс MultiplyMatrix и реализуйте метод multiply.
 * Метод берет два прямоугольных целочисленных массива (матрицы) и возвращает результат их умножения.
 * Рассмотрим две целочисленные матрицы, представленные в виде прямоугольных массивов.
 * Задача – перемножить данные матрицы. При таком умножении элементы в i-й строке матрицы A
 * умножаются на соответствующие элементы в j-м столбце матрицы B,
 * а сумма полученных значений сохраняется в ij-й элемент результирующей матрицы.
 * Обратите внимание, что количество столбцов в первой матрице равно количеству строк во второй матрице.
 * <p>
 * Две матрицы можно умножить, если число строк второй матрицы равно числу столбцов первой матрицы.
 * При умножении матриц получается матрица, число строк которой равно числу строк первой матрицы,
 */

public class MultiplyMatrix {
    public static int[][] multiply(int[][] m1, int[][] m2) {
        int m = m1.length; //число строк первой матрицы
        int n = m2.length; //число строк второй матрицы равно числу столбцов первой матрицы
        int l = m2[0].length; //число столбцов второй матрицы
        int[][] result = new int[m][l];

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < l; i++) {
                for (int k = 0; k < n; k++) {
                    result[j][i] += m1[j][k] * m2[k][i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {


        int[][] arr1 = {{1,2,3}, {4, 5,6}};
        int[][] arr2 = {{7, 8}, {9, 10},{11,12}};

//        int[][] arr1 = {{3, 5}, {2, 1}};
//        int[][] arr2 = {{8, 2, 3}, {1, 7, 2}};

        printAll(arr1);
        printAll(arr2);
        printAll(multiply(arr1, arr2));
    }

    public static void printAll(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}