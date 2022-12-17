public class MyCat implements Comparable<MyCat>{
    int age;
    String name;
    String gender;

    public MyCat(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MyCat[ "
                + age +
                ", name = '" + name + '\'' +
                ", gender = '" + gender + '\'' +
                ']';
    }

    @Override
    public int compareTo(MyCat o) {
//        return this.gender.compareTo(o.gender); //наоборот
        return o.gender.compareTo(this.gender);
    }
}
