//**Area of a Circle:** Ask the user to enter the radius and calculate the area of the circle.

   // Formula: \\(Area = 3.14 \times r \times r\\)
   import java.util.Scanner;
   public class Example9{
    public static void main(String[] args){
        Scanner circle = new Scanner(System.in);
        System.out.println("num1:");
        int r = circle.nextInt();
        System.out.println("area of circle:" + (22/7) *r* r);
    }
   }