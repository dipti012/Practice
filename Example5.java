//**Swap Two Variables:** Declare two integer variables and swap their values using a third variable.
public class Example5{
    public static void main(String[] args){
        int a =5;
        int b=6;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("swap:" + "a =" + a + "b=" + b);
    }
}