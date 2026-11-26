//7. **Swap Without Third Variable:** Swap two integer variables without using a third variable.
public class Example6{
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        a = a + b;

        b = a-b;
        a = a-b;
        System.out.println("swap:" + "a:" + a + "b:" + b);
    }
}