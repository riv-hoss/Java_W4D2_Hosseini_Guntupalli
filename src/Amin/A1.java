package Amin;

public class A1 {

    public static void main(String[] args) {
        int[] myNumbers = {1,2,3};
        try {
            System.out.println(myNumbers[10]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("===================Following exception throws" +
                    " form catch {} statement.=====================");
            System.out.println("Exception: " + e.getMessage());

        }


        System.out.printf("%n----------------------------------------%n" +
                "Printed after try-catch statements.%n" +
                "So, it means that exception event didn't%nterminate the whole program." +
                "%n------------------------------------------%n");
    }
}
