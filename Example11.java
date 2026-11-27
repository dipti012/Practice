//**Salary Calculator:** Accept basic salary, house rent allowance (HRA), and dearness allowance (DA). Calculate gross salary.

  //  Formula: Gross Salary = Basic Salary + HRA + DA
  import java.util.Scanner;
  public class Example11{

  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a basic salary:");
    double salary = input.nextDouble();
    System.out.println("Enter a house rent:");
    double rent = input.nextDouble();
    System.out.println("Enter a dearness allowance:");
    double allowance = input.nextDouble();
    System.out.println("Gross Salary:" + ( salary+rent+allowance));
  }
  }