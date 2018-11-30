package Chapter1;

/**
 * Created by averychen on 2/3/17.
 */
public class Cylinder {

    public static void main(String[] args) {
        int radius = 10;
        int length = 2;
        double pi = 3.14;

        double area = radius * radius * pi;
        System.out.print("Area = ");
        System.out.println(area);

        double volume = area * length;
        System.out.print("Volume = ");
        System.out.println(volume);

    }
}
