package pack.geometry;

public abstract class Figure {
    public String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}
// в интерфейсе нет конструктора,  а в абстрактном классе есть
// в интерфейсе только констатные поля - final  поля, которые нельзя изменить

// в абстрактных классах и в любых классах запрещено множественное наследование, но Си++ и Питон можно
// в интерфейсах возможно множественная реализация один класс может реализовать несколько интерфейсов (implements и дальше перечисление интерфейсов)

//public interface Figure {
//    // public String color = "red"; // final
//
//    // not allowed
////    public Figure(String color) {
////        this.color = color;
////    }
//   double calculateArea();
//}

class Circle extends    Figure{
    double  radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends   Figure{
    double height;
    double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double calculateArea(){
        return width * height;
    }
}

class Main{
    public static void main(String[] args)  {
//        Figure f = new Figure("");


//        Figure c1 = new Circle(12);
//        Figure r1 = new Rectangle(30,5);
//        System.out.println(c1.calculateArea());
//        System.out.println(r1.calculateArea());

        Figure[] figures = {new Circle("red",12), new Rectangle("blue",30,5) };
        for(Figure figure : figures ){
            // figure.color = "green";
            System.out.println(figure.color);
            System.out.println(figure.calculateArea());
        }


    }
}