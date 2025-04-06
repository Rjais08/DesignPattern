package SerializableDeserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableDemo {

    public static Account deserializeAccount(String fileName) {
        Account account = null;
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis)){
            account = (Account) objectInputStream.readObject();
            System.out.println("Account object has been deserialized from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return account;
    }
}
