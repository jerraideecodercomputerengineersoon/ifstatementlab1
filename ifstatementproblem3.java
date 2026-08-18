import java.util.Scanner;

public class ifstatementproblem3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("test score: ");
        int grade= input.nextInt();

        if (grade >= 90){
            System.out.println("excellent! ");
        } else if (grade >=75){
            System.out.println("Good ");
        } else {
            System.out.println("Needs improvement");
        }
    }
}
