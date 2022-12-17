public class MyCat {
    int age;
    String name;
    String gender;

    public MyCat(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyCat[ "
                + age +
                ", name = '" + name + '\'' +
                ", gender = '" + gender + '\'' +
                ']';
    }
}
