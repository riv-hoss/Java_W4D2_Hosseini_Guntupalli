package Sinduri.Intermediate.A5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A5 {
    public static int staticID = 0;
    private int arrayID;
    private String[] arrayString;
    public static List<Integer> intList = new ArrayList<>();

    public A5(String[] arrayString) throws CustomArrayIndexOutOfBoundsException, NotFoundInArrayException, SizeTooLargeException {

            try {

                if (intList.size() > 2) {
                    throw new SizeTooLargeException("The list size is larger than 3;");
                }

                int index = 5;
                if ((index + 1) > arrayString.length) {
                    throw new CustomArrayIndexOutOfBoundsException("The index " + index + " is out of bounds of the array");
                }

                boolean result = false;
                for(String i : arrayString){
                    if(i == "Sin"){
                        result = true;
                        break;
                    }
                }
                if(result == false) {
                    throw new NotFoundInArrayException("Sin not found in Array");
                }

                staticID++;
                this.arrayID = staticID;
                this.arrayString = arrayString;
                intList.add(arrayID);
                System.out.println("Created new object");


            } catch (CustomArrayIndexOutOfBoundsException | NotFoundInArrayException | SizeTooLargeException e) {
                System.out.println(e);
            }
    }

    @Override
    public String toString() {
        return "A5{" +
                "arrayID=" + arrayID +
                ", arrayString=" + Arrays.toString(arrayString) +
                '}';
    }
}
