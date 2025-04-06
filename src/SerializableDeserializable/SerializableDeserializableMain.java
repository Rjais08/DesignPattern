package SerializableDeserializable;

public class SerializableDeserializableMain {
    public static void main(String[] args) {

        checkSerializableDesirialization();
    }

    public static void checkSerializableDesirialization(){
        Account account = new Account(1, "Rahul", "SBI", "Pune");
        String fileName = "account.serialized";
        SerializableDemo.serializeAccount(account, fileName);

        Account deserializeAccount = DeSerializableDemo.deserializeAccount(fileName);
        System.out.println("Deserialized Account: " + deserializeAccount);
    }
}
