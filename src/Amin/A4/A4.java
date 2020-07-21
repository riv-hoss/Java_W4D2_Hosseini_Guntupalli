package Amin.A4;

import java.util.Scanner;

public class A4 {


    public static double g(double kg) throws FirstException {
        if (kg >= 0.0000) {
            return kg * 2.2046;

        } else {
            throw new FirstException("Please provide valid plus weight only!");
        }

    }

    public static void f() throws SecondException, FirstException {

        System.out.print("Please enter your weight in KG: ");
        Scanner in = new Scanner(System.in);


        try {
            if (in.hasNextDouble()) {
                double num = in.nextDouble();
                System.out.println("Wight in lbs is: " + g(num));
            } else {
                throw new SecondException("Please enter floating point number only! e.g. '2.25'");

            }


        } catch (FirstException | SecondException e) {
            System.out.println("Exception: " + e.getMessage());

        }


    }

    public static void main(String[] args) {
        try{
            f();

        } catch (FirstException | SecondException e) {
            System.out.println(e.getMessage());
        }
    }
}
