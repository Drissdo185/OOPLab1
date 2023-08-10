public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void verify() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Not Triangle");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
