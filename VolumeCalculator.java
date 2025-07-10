import java.util.Scanner;

class GeometricFigure {
    private double volume;

    public double getVolume() {
        return volume;
    }

    protected void setVolume(double volume) {
        this.volume = volume;
    }
}

class Cube extends GeometricFigure {
    private double side;

    public Cube(double side) {
        this.side = side;
        calculateVolume();
    }

    private void calculateVolume() {
        setVolume(Math.pow(side, 3));
    }
}

class Sphere extends GeometricFigure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        calculateVolume();
    }

    private void calculateVolume() {
        setVolume((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}

class Cylinder extends GeometricFigure {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        calculateVolume();
    }

    private void calculateVolume() {
        setVolume(Math.PI * Math.pow(radius, 2) * height);
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the cube: ");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Volume of Cube: " + cube.getVolume());

        System.out.print("Enter radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Volume of Sphere: " + sphere.getVolume());

        System.out.print("Enter radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());

        scanner.close();
    }
}