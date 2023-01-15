import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int m = matrix1.length; //число строк первой
        int n = matrix2[0].length; //число столбцов второй
        int o = matrix2.length; //число строк второй (оно же число столбцов первой)
        int[][] result = new int[m][n]; // создаем итоговую матрицу,m строк n столбцов

        for (int i = 0; i < m; i++) { //цикл строки первой матрицы
            for (int j = 0; j < n; j++) { // цикл столбца второй матрицы
                for (int k = 0; k < o; k++) { // цикл длины второй матрицы
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; // умножаем первую и вторую матрицу, затем складываем
                }
            }
        }

        for (int i = 0; i < result.length; i++) { //цикл строки (длина результата в матрице)
            for (int j = 0; j < result[0].length; j++) { //цикл столбца (длина резельтата в матрице)
            }
        }
        return result; //возвращаем результат
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");
        ArrayList<String> me = new ArrayList<String>();

// Get a result of your code
        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567}};

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
