import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

class twoD {
    void circle(double radius) {
        try {
            double cir = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            System.out.printf("Circumference of the circle = %.3f units\n", cir);
            System.out.printf("Area of the circle = %.3f square units\n", area);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void triangle(double base, double height) {
        try {
            double peri = base + base + base;
            double area = (base * height) / 2;
            System.out.printf("Perimeter of the triangle = %.3f units\n", peri);
            System.out.printf("Area of the triangle = %.3f square units\n", area);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void square(double side) {
        try {
            double peri = 4 * side;
            double area = side * side;
            System.out.printf("Perimeter of the square = %.3f units\n", peri);
            System.out.printf("Area of the square = %.3f square units\n", area);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void rectangle(double length, double breadth) {
        try {
            double peri = 2 * (length + breadth);
            double area = length * breadth;
            System.out.printf("Perimeter of the rectangle = %.3f units\n", peri);
            System.out.printf("Area of the rectangle = %.3f square units\n", area);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void parallelogram(double base, double height, double side) {
        try {
            double peri = 2 * (base + side);
            double area = base * height;
            System.out.printf("Perimeter of the parallelogram = %.3f units\n", peri);
            System.out.printf("Area of the parallelogram = %.3f square units\n", area);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void rhombus(double side, double diagonal1, double diagonal2) {
        try {
            double peri = 4 * side;
            double area = (diagonal1 * diagonal2) / 2;
            System.out.printf("Perimeter of the rhombus = %.3f units\n", peri);
            System.out.printf("Area of the rhombus = %.3f square units\n", area);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }
}

class threeD {
    void sphere(double radius) {
        try {
            double area = 4 * Math.PI * radius * radius;
            double volume = 4f / 3 * (Math.PI * radius * radius * radius);
            System.out.printf("Area of the sphere = %.3f square units\n", area);
            System.out.printf("Volume of the sphere = %.3f cubic units\n", volume);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void cylinder(double radius, double height) {
        try {
            double area = 2 * Math.PI * radius * (height + radius);
            double volume = Math.PI * radius * radius * height;
            System.out.printf("Area of the cylinder = %.3f square units\n", area);
            System.out.printf("Volume of the cylinder = %.3f cubic units\n", volume);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void cone(double radius, double height) {
        try {
            double slantLength = Math.sqrt(((height * height) + (radius * radius)));
            double lateralSurfaceArea = Math.PI * radius * slantLength;
            double totalSurfaceArea = Math.PI * radius * (slantLength + radius);
            double volume = (Math.PI * radius * radius * height) / 3;
            System.out.printf("Slant length of the cone = %.3f units\n", slantLength);
            System.out.printf("Lateral Surface Area of the cone = %.3f square units\n", lateralSurfaceArea);
            System.out.printf("Total Surface Area of the cone = %.3f square units\n", totalSurfaceArea);
            System.out.printf("Volume of the cone = %.3f cubic units\n", volume);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void cube(double side) {
        try {
            double lateralSurfaceArea = 4 * side * side;
            double totalSurfaceArea = 6 * side * side;
            double volume = side * side * side;
            System.out.printf("Lateral Surface Area of the cube = %.3f square units\n", lateralSurfaceArea);
            System.out.printf("Total Surface Area of the cube = %.3f square units\n", totalSurfaceArea);
            System.out.printf("Volume of the cube = %.3f cubic units\n", volume);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }

    void cuboid(double length, double breadth, double height) {
        try {
            double lateralSurfaceArea = 2 * height * (length + breadth);
            double totalSurfaceArea = 2 * ((length * breadth) * (breadth * height) * (length * height));
            double volume = length * breadth * height;
            System.out.printf("Lateral Surface Area of the cuboid = %.3f square units\n", lateralSurfaceArea);
            System.out.printf("Total Surface Area of the cuboid = %.3f square units\n", totalSurfaceArea);
            System.out.printf("Volume of the cuboid = %.3f cubic units\n", volume);
        } catch (ArithmeticException ae) {
            System.out.println("Error --> " + ae);
            System.out.println("\n********** Thank You **********");
        }
    }
}

public class Calculator_For_Perimeter_And_Area {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            twoD d2 = new twoD();
            threeD d3 = new threeD();
            System.out.println("********** Calculator: Area and Perimeter **********");
            Calendar c = Calendar.getInstance();
            System.out.println("Logged in --> " + c.getTime());
            System.out.print("Enter 2D/3D: ");
            String d = sc.next();
            if (d.equalsIgnoreCase("2D")) {
                System.out.print("Enter the name of the shape (Circle/Triangle/Square/Rectangle/Parallelogram/Rhombus): ");
                String shape2D = sc.next();
                if (shape2D.equalsIgnoreCase("Circle")) {
                    System.out.print("Enter the length of the radius of the circle: ");
                    double radius = sc.nextDouble();
                    d2.circle(radius);
                } else if (shape2D.equalsIgnoreCase("Triangle")) {
                    System.out.print("Enter the length of the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the length of the height of the triangle: ");
                    double height = sc.nextDouble();
                    d2.triangle(base, height);
                } else if (shape2D.equalsIgnoreCase("Square")) {
                    System.out.print("Enter the length of the side of the square: ");
                    double side = sc.nextDouble();
                    d2.square(side);
                } else if (shape2D.equalsIgnoreCase("Rectangle")) {
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    double breadth = sc.nextDouble();
                    d2.rectangle(length, breadth);
                } else if (shape2D.equalsIgnoreCase("Parallelogram")) {
                    System.out.print("Enter the length of the base of the parallelogram: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the length of the height of the parallelogram: ");
                    double height = sc.nextDouble();
                    System.out.print("Enter the length of the side of the parallelogram: ");
                    double side = sc.nextDouble();
                    d2.parallelogram(base, height, side);
                } else if (shape2D.equalsIgnoreCase("Rhombus")) {
                    System.out.print("Enter the length of the side of the rhombus: ");
                    double side = sc.nextDouble();
                    System.out.print("Enter the length of the first diagonal of the rhombus: ");
                    double diagonal1 = sc.nextDouble();
                    System.out.print("Enter the length of the second diagonal of the rhombus: ");
                    double diagonal2 = sc.nextDouble();
                    d2.rhombus(side, diagonal1, diagonal2);
                } else {
                    System.out.println("You have given a wrong input.");
                }
            } else if (d.equalsIgnoreCase("3D")) {
                System.out.print("Enter the name of the shape (Sphere/Cylinder/Cone/Cube/Cuboid): ");
                String shape3D = sc.next();
                if (shape3D.equalsIgnoreCase("Sphere")) {
                    System.out.print("Enter the length of the radius of the sphere: ");
                    double radius = sc.nextDouble();
                    d3.sphere(radius);
                } else if (shape3D.equalsIgnoreCase("Cylinder")) {
                    System.out.print("Enter the length of the radius of the cylinder: ");
                    double radius = sc.nextDouble();
                    System.out.print("Enter the length of the height of the cylinder: ");
                    double height = sc.nextDouble();
                    d3.cylinder(radius, height);
                } else if (shape3D.equalsIgnoreCase("Cone")) {
                    System.out.print("Enter the length of the radius of the cone: ");
                    double radius = sc.nextDouble();
                    System.out.print("Enter the length of the height of the cone: ");
                    double height = sc.nextDouble();
                    d3.cone(radius, height);
                } else if (shape3D.equalsIgnoreCase("Cube")) {
                    System.out.print("Enter the length of the side of the cube: ");
                    double side = sc.nextDouble();
                    d3.cube(side);
                } else if (shape3D.equalsIgnoreCase("Cuboid")) {
                    System.out.print("Enter the length of the cuboid: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the breadth of the cuboid: ");
                    double breadth = sc.nextDouble();
                    System.out.print("Enter the height of the cuboid: ");
                    double height = sc.nextDouble();
                    d3.cuboid(length, breadth, height);
                }
            } else {
                System.out.println("You have given a wrong input.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        } finally {
            System.out.println("\n********** Thank You **********");
        }
    }
}
