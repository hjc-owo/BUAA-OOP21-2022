package Question04;

public abstract class Shape {
    protected double a;
    protected double b;
    protected double area;

    public Shape() {
        this(0.0, 0.0);
    }

    public Shape(double a, double b) {
        if(a<0)
            this.a=0;
        else
            this.a = a;
        if(b<0)
            this.b=0;
        else
            this.b = b;
    }


    /**
     * calcArea
     * 计算形状的面积
     *
     * @return 面积
     */
    abstract public double calcArea();
    /* 其他必要的方法，比如 getter 和 setter */
    public void getArea(){
        System.out.println(area);
    }
    public void getA(){
        System.out.println(a);
    }
    public void getB(){
        System.out.println(b);
    }
    public void setter(double a,double b){
        if(a<0)
            this.a = 0;
        if(b<0)
            this.b = 0;
    }

}
class Rectangle extends Shape {
    public Rectangle(double a,double b){
        super(a,b);
    }
    public double calcArea(){
        this.area = this.a*this.b;
        return this.area;
    }

}
class Rhombus extends Shape {
    public Rhombus(double a,double b){
        super(a,b);
    }
    public double calcArea(){
        this.area= this.a*this.b/2;
        return this.area;
    }
}
class Ellipse extends Shape {
    public Ellipse(double a,double b){
        super(a,b);
    }
    public double calcArea(){
        this.area = 3.14*this.a*this.b;
        return this.area;
    }
}
