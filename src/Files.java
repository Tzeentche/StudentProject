import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Files {

    public static void main(String[] args) {

        File file = new File("tmp.txt");

        if(file.exists()) {
            file.mkdir();
            System.out.println("exists");
        }

        if(file.isDirectory()) {
            System.out.println("dir");
        }

        if(file.isFile()) {
            System.out.println("file");
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] someChars = new char[20];
        fileReader.read(someChars);
        System.out.println(someChars);
    }
}
