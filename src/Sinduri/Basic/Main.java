package Sinduri.Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("A1.");
        try {
            int[] myNumbers = {1, 2, 3};

            System.out.println(myNumbers[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("\nA3.");
        File named = new File("file.txt");
        cat(named);


    }

    public static void cat(File named) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(named, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch(FileNotFoundException fe) {
            System.err.format("File %s not found", named);
        } catch(IOException ie) {
            System.err.println(ie.toString());
        }
        finally {
            if (input != null) {
                try {
                    input.close();
                } catch(IOException io) {
                    System.err.println(io.toString());
                }

            }
        }
    }
}
