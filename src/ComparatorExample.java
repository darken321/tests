import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Pasha", "Sveta", "Olya", "Lena", "Masha", "Alla", "Dima");
        System.out.println("Not sorted " + list);

        // сортировка по возрастанию - по умолчанию
        Collections.sort(list);
        System.out.println("Ascending " + list);

        //сортировка по убыванию, компаратор в обратном порядке
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Descending" + list);


        //создается компаратор
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        //компаратор лямбда
        Collections.sort(list, (o2, o1) -> o1.compareTo(o2));
        System.out.println("Descending" + list);

        //только по возрастанию
        Collections.sort(list, String::compareTo);
        System.out.println("Ascending" + list);

        //статический метод компаратора comparing
        Comparator<String> comp = Comparator.comparing(o1 -> o1);
        list.sort(comp);
        System.out.println("Ascending" + list);

    }
}
