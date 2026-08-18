import java.util.Scanner;

public class ifstatementproblem2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Today's temperature: ");
        int temp= input.nextInt();

        if (temp < 0){
            System.out.println("freezing point, ang lamig! ");
        } else if (temp <= 25){
            System.out.println("normal weather. ");
        } else {
            System.out.println("Hot weather.");
        }
    }
}