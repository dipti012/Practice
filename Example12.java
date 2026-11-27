//**Distance Converter:** Accept distance in kilometers and convert it into meters and centimeters.
import java.util.Scanner;
public class Example12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        double num = input.nextDouble();
        System.out.println("meter:" + (num*1000) );
        System.out.println("centimeter:" +  (num*10000));
    }
}
