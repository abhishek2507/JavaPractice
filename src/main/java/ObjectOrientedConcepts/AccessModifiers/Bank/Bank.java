package ObjectOrientedConcepts.AccessModifiers.Bank;

class Account{
    public String name; //Everywhere even outside package as import, for Default only within package accesible
    protected String email; //Only Subclass of other packages as import
    private String password; //Only the class Account

    //We use Getter and Setter

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Abhishek";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
