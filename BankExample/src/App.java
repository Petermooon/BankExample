import dto.BankAccount;
import dto.Client;

public class App {

    public static void main (String [] args){

        BankAccount bankAccount = new BankAccount();
        Client client = new Client();

        bankAccount.setBankAccountNumber("001");
        bankAccount.setBalance(100);

        client.setBankAccount(bankAccount);
        client.setClientNumber("0001");

        System.out.println("el cliente con el numero:" + client.getClientNumber() );
        System.out.println("tiene un balance de:" + client.getBankAccount().getBalance() );
        System.out.println("en su cuenta numero:" + client.getBankAccount().getBankAccountNumber());






    }

}
