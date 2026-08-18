import java.util.Scanner;

public class IfelseStatementproblem1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age= input.nextInt();

        if (age < 13){
            System.out.println("You are a child!. ");
        } else if (age <= 19){
            System.out.println("Your are a teenager. ");
        } else {
            System.out.println("you are and adult.");
        }
    }
}