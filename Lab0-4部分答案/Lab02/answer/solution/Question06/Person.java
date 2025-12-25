public class Person {
    private String name;
    private int age;
    private int sex; // 1 for man, 0 for women

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 130)
            this.age = age;
        else
            System.out.println("warning: age should between 0 and 130");
    }

    public void showAge() {
        System.out.println(age);
    }

    public void work() {
        System.out.println("working");
    }
}
