//**Age Calculator:** Accept the user's birth year and current year. Calculate their approximate age.
import java.util.Scanner;
public class Example13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a current year:");
        int year = input.nextInt();
        System.out.println("Enter a birth year:");
        int year1 =input.nextInt();
        System.out.println("age:" + (year-year1));
            }
            }