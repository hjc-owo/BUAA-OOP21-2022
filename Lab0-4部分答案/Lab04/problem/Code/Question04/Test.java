package Question04;

public class Test {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 3);
        System.out.println("rec:");
        rec.calcArea();
        rec.getA();
        rec.getB();
        rec.getArea();
        Rhombus rho = new Rhombus(2, 3);
        System.out.println("rho:");
        rho.calcArea();
        rho.getA();
        rho.getB();
        rho.getArea();
    }
}