//8. **Personal Information:** Ask the user to enter their name, 
// age, address, and phone number. Display the entered information.
import java.util.Scanner;
public class Example7{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a name:");
    String name = input.nextLine();
    System.out.println("Enter a age :");
    double age = input.nextInt();
    System.out.println("Enter a address:");
    String address = input.nextLine();
    System.out.println("Enter phone number:");
    int number = input.nextInt();
    System.out.println("name:" + name);
    System.out.println("age:" + age);
    System.out.println("address:" + address);
    System.out.println("number:" + number);
    input.close();
}
}