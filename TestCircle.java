import java.util.Scanner;

public class TestCircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radius;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        while(radius < 0)
        {
            System.out.print("Negative values are not allowed, Please re-enter a positive value : ");
            radius = sc.nextDouble();
        }

        Circle c1 = new Circle(radius);

        System.out.println("\nCircle Details");
        System.out.println("Radius: " + c1.radius);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());

    }
}