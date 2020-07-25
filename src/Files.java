import java.io.*;
import java.nio.Buffer;

public class Files {

    public static void main(String[] args) throws Exception {

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

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
//        bufferedWriter.flush();
//        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
