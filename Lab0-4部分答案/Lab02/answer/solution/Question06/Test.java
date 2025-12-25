public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("XiaoMing", 18, 0);
        Person person2 = new Person("XiaoHong", 18, 1);
        person1.showAge(); person1.setAge(9); person1.setAge(-1); person1.showAge();
        person2.showAge(); person2.setAge(131); person2.showAge();
    }
}