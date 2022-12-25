/**
 * Перейдите в класс com.epam.rd.autotasks.arrays.SumOfPrevious и реализуйте метод getSumCheckArray.
 * <p>
 * Правильная реализация должна получить массив значений int и вернуть массив логических значений, где каждый элемент
 * является результатом проверки: является ли соответствующий исходный элемент суммой двух предыдущих элементов в данном массиве.
 * <p>
 * Подробности:Гарантируется, что длина данного массива составляет 2 или более.
 * Данный массив гарантированно не равен null.
 * Метод возвращает массив логических значений, где каждый элемент является результатом для соответствующего элемента в данном массиве.
 * Первые два элемента логического массива всегда false.
 */
class SumOfPrevious {
    public static boolean[] getSumCheckArray(int[] ar) {
        boolean[] result = new boolean[ar.length];
        for (int i = 2; i < ar.length; i++) {
            result[i] = (ar[i] == ar[i - 1] + ar[i - 2]);
        }
        return result;
    }
}

class test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 9, 7, 8, 9, 10};
        boolean[] result = SumOfPrevious.getSumCheckArray(array);
        int i=0;
        for (boolean b:result) {
            System.out.println(b + " " + array[i++]);
        }
    }
}