package SerializableDeserializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

    public static void serializeAccount(Account account, String fileName){
        try(FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fout);){
            outputStream.writeObject(account);
            System.out.println("Account object has been serialized to " + fileName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
