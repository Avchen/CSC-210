package csc211;

/**
 * Created by averychen on 4/14/17.
 */
class Main {

    public static void main (String[] args) {
        Triangle t1 = new Triangle( 1, 2, 3);
        System.out.println(t1.isScalene());
    }
}

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int... sides) {
        sideA = sides[0];
        sideB = sides[1];
        sideC = sides[2];
    }

    public void setSideA(int sideA) {

        this.sideA = sideA;
    }

    public int getSideA() {

        return sideA;
    }

    public boolean isScalene() {
        if (sideA != sideB) {
            if (sideA != sideC) {
                if (sideB != sideC) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isRight() {
        return true;
    }

    public boolean isIsosceles() {
        return (sideA == sideB) || (sideB == sideC) || (sideA == sideC);
    }

    public boolean isEquilateral() {
        return (sideA == sideB) && (sideB == sideC) && (sideA == sideC);
    }

    public boolean isValid() {
        return true;
    }
}


