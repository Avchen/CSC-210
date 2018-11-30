package Chapter9;

/**
 * Created by averychen on 3/27/17.
 */
public class Circle {
        // The radius of this circle
        private double radius;

        // Construct a circle object
        public Circle(){

            radius = 1;
        }

        // Construct a circle object
        public Circle(double newRadius) {

            this.radius = newRadius;
        }

        // Return the area of this circle
        double getArea() {

            return radius * radius * Math.PI;
        }

        // Return the perimeter of the circle
        double getPerimeter() {

            return 2 * radius * Math.PI;
        }

        // Set new radius 
        double setRadius (double newRadius) {
            radius = newRadius;
            return newRadius;
        }

}

//import java.util.Scanner;
class TestCircle {

    public static void main (String[] args){

        //Scanner scanner = new Scanner(System.in);

        //int radius1 = scanner.nextInt();
        Circle myCircle = new Circle(10);
        double area = myCircle.getArea();
        double perimeter = myCircle.getPerimeter();
        double newRadius = myCircle.setRadius(100);
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        System.out.println(newRadius);
    }
}
