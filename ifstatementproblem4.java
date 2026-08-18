import java.util.Scanner;

public class ifstatementproblem4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double pi=3.14159;

        System.out.print("Enter the radius of the circle: ");
        double radius= input.nextDouble();

        if (radius <= 0){
            System.out.println("Invalid radius ");
        } else {
            double area = pi * radius * radius;
            double circum = 2 * pi * radius;
            
            System.out.println("Area: " + area);
            System.out.println("Circumference:"+ circum);
        } 
        
    }
}
