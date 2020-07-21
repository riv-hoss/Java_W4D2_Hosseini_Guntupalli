package Sinduri.Basic;

public class DivideByZero {

    public static void main(String[] args) {
        System.out.println("A2 & A2.A3");
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) { //A2 - use Exception, A2.A3 - Use ArithemeticException
            System.out.println(e);
        }
    }

}
