package Sinduri.QAnswers;

public class QnA {
    public static void printQnA() {
        System.out.println("QnA");
        System.out.println("\n1.");
        System.out.println("try {\n" +
                "\t// Block of code with multiple exit points\n" +
                "} finally {\n" +
                "\t// Block of code that is always executed when the try block is exited,\n" +
                "\t// no matter how the try block is exited\n" +
                "}");
        System.out.println("This is legal.\n");
        System.out.println("2.");
        System.out.println("catch (Exception e) {\n" +
                "}");
        System.out.println("This handler catches exceptions of type Exception; therefore, it catches any exception. \nThis can be a poor implementation because you are losing valuable information about the type of exception being thrown and making your code less efficient. \nAs a result, your program may be forced to determine the type of exception before it can decide on the best recovery strategy.");
        System.out.println("Each catch block is an exception handler that handles the type of exception indicated by its argument. \nThe argument type, ExceptionType, declares the type of exception that the handler can handle and must be the name of a class that inherits from the Throwable class. \nThe handler can refer to the exception with name.");
        System.out.println("Types of Exceptions: \n" +
                "\t1. Checked Exception\n" +
                "\t\tThe classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. \n\t\tChecked exceptions are checked at compile-time.\n" +
                "\t2. Unchecked Exception\n" +
                "\t\tThe classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. \n\t\tUnchecked exceptions are not checked at compile-time, but they are checked at runtime.\n" +
                "\t3. Error\n" +
                "\t\tError is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.\n");
        System.out.println("\n3.");
        System.out.println("try {\n" +
                "} catch (Exception e) {\n" +
                "} catch (ArithmeticException a) {\n" +
                "}");
        System.out.println("Arithmetic exception is an Exception, so it has already been caught in the first catch.");


    }
}
