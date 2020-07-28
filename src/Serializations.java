import java.io.*;

public class Serializations {

    public static void main(String[] args) throws Exception {
        Serialisables user = new Serialisables();
        user.lifeLevel = 55;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;
        user.childLevel = 65;

        FileOutputStream fileOutputStream = new FileOutputStream("tempfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.sword.level);
//        System.out.println(newUser.childLevel);
    }
}

class User implements Serializable {

    int lifeLevel;
    Sword sword;
}

class Sword implements Serializable {
    int level;
}