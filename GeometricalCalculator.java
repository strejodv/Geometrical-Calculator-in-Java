// Importing scanner //
import java.util.Scanner;  

// The Main Class //
public class GeometricalCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create scanner object for input // 

        // Calculating the area of a rectangle //
        System.out.println("Calculating the area of a rectangle.");

            try {
                // Retrieving the length and width from the user // 
                System.out.print("Enter Length: ");
                double rectLength = input.nextDouble();
                System.out.print("Enter Width: ");
                double rectWidth = input.nextDouble();

                // Creating a reactangle object and calculating the area //
                Rectangle rectangle = new Rectangle(rectLength, rectWidth);
                System.out.println("Rectangle area is: " + rectangle.calculateArea());

                // Calculating the volumes //
                System.out.println("\nLets calculate the volume of different shapes.");

                // Get the radius from the user and calculate sphere volume //
                System.out.print("Enter sphere radius: ");
                double sphereRadius = input.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);  // Creating the sphere object //
                System.out.println("sphere's volume is: " + sphere.calculateVolume());

                // Getting radius and height from user for cylinder volume //
                System.out.print("Enter cylinder radius: ");
                double cylinderRadius = input.nextDouble();
                System.out.print("Enter cylinder height: ");
                double cylinderHeight = input.nextDouble();
                Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);  // Creating the cylinder object //
                System.out.println("Cylinder's volume: " + cylinder.calculateVolume());

                // Getting the side length from user for cube volume //
                System.out.print("Enter the side length of a cube: ");
                double cubeSide = input.nextDouble();
                Cube cube = new Cube(cubeSide);  // Create Cube object
                System.out.println("The volume of the cube is: " + cube.calculateVolume());
        
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number.");
            } finally {
                input.close();  // Closing the scanner //
            }
        }
}

// This is the class for the rectangle //
class Rectangle {
    private double length;
    private double width;

    // The constructors to for the width and length of the rectangle //
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // The method to calculate the area of the rectangle //
    public double calculateArea() {
        return length * width;
    }
}

// This is the class for the sphere //
class Sphere {
    private double radius;

    // The constructors to set the radius of the sphere //
    public Sphere(double radius) {
        this.radius = radius;
    }

    // The method to calculate the volume of the sphere objet //
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

// This is the class for the cylinder //
class Cylinder {
    private double radius;
    private double height;

    // the constructor for the height and length of the cylinder object //
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // The method to calculate the volume of the cylinder object //
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

// The class for the cube //
class Cube {
    private double side;

    // the constructor to get the height for the cube object //
    public Cube(double side) {
        this.side = side;
    }

    // The method to calculate the volume of the cube //
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
