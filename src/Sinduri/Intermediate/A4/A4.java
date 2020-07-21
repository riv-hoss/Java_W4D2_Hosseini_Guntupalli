package Sinduri.Intermediate.A4;

public class A4 {
    public static void f() {
        try {
            g();
        } catch (IllegalArgumentException ie) {
            System.out.println(ie);

        }

    }

    public static void g() {
        throw new NullPointerException("Throwing Null Pointer Exception from method g!");

    }
}
