import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {
        MyCat cat1 = new MyCat(12, "Mops", "M");
        MyCat cat2 = new MyCat(12, "Kot", "F");
        MyCat cat3 = new MyCat(8, "Omom", "F");
        MyCat cat4 = new MyCat(6, "Barsik", "M");

        //List cats = new ArrayList<>(List.of(1,2,3,4));
        List<MyCat> catList = new LinkedList<>(List.of(cat1, cat2, cat3, cat4));
        System.out.println("До сортировки");
        printAll(catList);

        System.out.println("\nСортировка по имени");
        class nameComparator implements Comparator<MyCat> {
            @Override
            public int compare(MyCat c1, MyCat c2) {
                return c1.name.compareTo(c2.name);
            }
        }
        catList.sort(new nameComparator());
        printAll(catList);

        // текущий класс MyCat должен реализовать интерфейс Comparator<MyCat>
        System.out.println("\nСортировка по полу - по умолчанию");
        Collections.sort(catList);
        printAll(catList);

        System.out.println("\nСортировка по возрасту");
        Comparator<MyCat> ageComparator = Comparator.comparing(obj -> obj.age);
        Collections.sort(catList, ageComparator);
        printAll(catList);

        System.out.println("\nСортировка по возрасту и имени последние два");
        Comparator<MyCat> ageNameComparator = ageComparator.thenComparing(obj -> obj.name);
        Collections.sort(catList, ageNameComparator);
        printAll(catList);
    }

    static void printAll(List<MyCat> cats) {
        for (MyCat c : cats) {
            System.out.println(c);
        }
    }

//    static class ageComparator implements Comparator<MyCat> {
//        @Override
//        public int compare(MyCat c1, MyCat c2) {
//            if (c1.age == c2.age) {
//                return 0;
//            }
//            if (c1.age > c2.age) {
//                return 1;
//            }
//            return -1;
//        }
//    }

}
