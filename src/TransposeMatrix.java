/** Перейдите в класс TransposeMatrix и реализуйте метод multiply.
 * Метод принимает в качестве параметра прямоугольный целочисленный массив (матрицу) и возвращает его транспонированным.
 * Рассмотрим целочисленную матрицу, представленную в виде прямоугольного массива. Задача состоит в том, чтобы транспонировать ее по главной диагонали.
 * Результат транспонирования матрицы – это перевернутая по главной дагонали версия исходной матрицы.*/

public class TransposeMatrix {
    public static int[][] multiply(int[][] array) {
        int[][] result = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result[i][j] = array[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr2D = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        printAll(arr2D);
        arr2D = multiply(arr2D);
        printAll(arr2D);
    }

    public static void printAll(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
