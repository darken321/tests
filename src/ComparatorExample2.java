import java.util.LinkedList;
import java.util.List;

public class ComparatorExample2 {
    public static void main(String[] args) {
        MyCat cat1 = new MyCat(22,"Mops","M");
        MyCat cat2 = new MyCat(12,"Kot","F");
        MyCat cat3 = new MyCat(8,"Omom","F");
        MyCat cat4 = new MyCat(6,"Barsik","M");
        List<MyCat> catList = new LinkedList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);

        System.out.println("До сортировки");
        printAll(catList);
    }
    static void printAll(List<MyCat> cats){
        for (MyCat c: cats) {
            System.out.println(c);
        }
    }
}
