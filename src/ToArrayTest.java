import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// варианты Как преобразовать List в массив

public class ToArrayTest {
    public static void main(String[] args) {
        ArrayList <String> letterList = new ArrayList<>();

        List<String> list = List.of("x","y","z");
        letterList.add("ab");
        letterList.add("cd");
        letterList.add("ef");
        letterList.add("gh");

        /* 11111
        В параметрах toArray пишется массив такого типа (желательно пустой) какого типа будет новый массив.
                и метод toArray вытягивает из него класс String через встроенный getMethod*/
        String[] objArray1 = letterList.toArray(new String[0]);
        printAll(objArray1);

        /* 22222
        возвращает массив типа Object и тогда не надо писать массив с типом в параметрах
        Метод toArray() без передачи каких-либо аргументов возвращает Object[]
         */
        Object[] array = list.toArray();
        printAll(array);

        /*44444
        поток он же stream
         */
        String[] myArray = letterList.stream().toArray(String[]::new);
        printAll(myArray);
        //String[] arrayBeforeJDK11 = list.toArray(new String[0]);
        //String[] arrayAfterJDK11 = list.toArray(String[]::new);
    }
    static void printAll(Object[] arr){
        System.out.println();
        for (Object o: arr) {
            System.out.println(o);
        }
    }
}
