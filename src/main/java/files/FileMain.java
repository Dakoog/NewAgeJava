package files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class FileMain {
    public static void main(String[] args) throws IOException {
        File myFile = new File("ala.txt");
        File newFile = new File("myPoetry.txt");

        isExistFile(myFile);
        createdNewFile(newFile);
        System.out.println("\nCreated new file: " + newFile);
        writer(newFile);

    }

    // entering text in the file
    private static void writer(File file) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("28 lutego 2000");
        printWriter.println("Promienie słońca rozwijają pąki\n" +
                "Drzew owocowych, kwiatów i krzewów\n" +
                "W wiosennym locie, brząkają bąki\n" +
                "A w sercu smutek, bo brak jest Ciebie.");
        printWriter.close();
    }

    // created new file for this project
    private static void createdNewFile(File file) throws IOException {
        boolean newFile = file.createNewFile();

    }

    // check if exists file
    private static void isExistFile(File file) throws FileNotFoundException {
        boolean exists = file.exists();

        if (!file.exists()) {
            System.out.println("Not found myFile ");
            // showing path where this myFile is
            System.out.println("Warning! MyFile should be here :  " + file.getAbsolutePath());

        } else {
            System.out.println("Good. MyFile is here! ");
            // showing of myFile content
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);
            }

        }
    }
}

