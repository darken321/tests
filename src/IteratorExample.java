import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        final int NUM = 999;
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 11, 22, 33, 44, 55, 66, 77);
        //Iterator<Integer> iterator = list.iterator();
        printList(list);
        ListIterator<Integer> iterator = list.listIterator();

        //add
        System.out.println("Добавляю + " + NUM + " после элементов+ Итерация вперед");
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element > 22 & element < 50) {
                System.out.println(element + " add after +");
                iterator.add(NUM);
            }
        }
        //System.out.println("лист на автомате " + list);
        printList(list);
        System.out.println("Индекс предыдущего элемента " + iterator.previousIndex());

        //remove
        System.out.println("Удаляю часть элементов - Итерация назад");
        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            if (element > 40 & element < 60) {
                System.out.println(element + " remove -");
                iterator.remove();
            }
        }
        printList(list);

        //set
        System.out.println("Заменяю " + NUM + " на " + (NUM - 111) + " - Итерация вперед");
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element == 999) {
                System.out.println(element + " remove -");
                iterator.set(NUM - 111);
            }
        }
        printList(list);

        //forEachRemaining(Consumer<? super E> action)
        /*Выполняет данное действие для каждого оставшегося элемента
         до тех пор, пока все элементы не будут обработаны
         или действие не выдаст исключение.*/
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println();
    }
}
