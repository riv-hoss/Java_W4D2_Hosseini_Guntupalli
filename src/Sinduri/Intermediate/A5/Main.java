package Sinduri.Intermediate.A5;

import static Sinduri.Intermediate.A5.A5.intList;

public class Main {
    public static void main(String[] args) throws SizeTooLargeException, NotFoundInArrayException, CustomArrayIndexOutOfBoundsException {

        String[] arrayString1 = {"Luna", "Hans", "Minerva", "Ahalya", "Hemu", "Hella"};

        A5 a51 = new A5(arrayString1);
        System.out.println(a51.toString());

        System.out.println("Number of objects created: " + intList.size() + ".\n");

        String[] arrayString2 = {"Luna", "Hans", "Minerva", "Ahalya", "Hemu", "Hella", "Sin"};

        A5 a52 = new A5(arrayString2);
        System.out.println(a52.toString());

        System.out.println("Number of objects created: " + intList.size() + ".\n");

        String[] arrayString3 = {"Luna", "Hans", "Minerva", "Ahalya", "Hemu", "Hella", "Sin"};

        A5 a53 = new A5(arrayString3);
        System.out.println(a53.toString());

        System.out.println("Number of objects created: " + intList.size() + ".\n");

        String[] arrayString4 = {"Luna", "Hans", "Minerva", "Ahalya", "Sin"};

        A5 a54 = new A5(arrayString4);
        System.out.println(a54.toString());

        System.out.println("Number of objects created: " + intList.size() + ".\n");

        String[] arrayString5 = {"Luna", "Hans", "Minerva", "Ahalya", "Hemu", "Hella", "Sin"};

        A5 a55 = new A5(arrayString5);
        System.out.println(a55.toString());

        System.out.println("Number of objects created: " + intList.size() + ".\n");


    }
}
