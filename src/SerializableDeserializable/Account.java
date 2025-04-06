package SerializableDeserializable;

import java.io.Serializable;

public class Account implements Serializable {

    private int accountNumber;
    private String accountHolderName;
    private String bankName;
    private String branchName;

    public Account(int accountNumber, String accountHolderName, String bankName, String branchName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.branchName = branchName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    @Override
    public String toString(){
        return "Account{"+
                "accountNumber="+accountNumber+ '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
