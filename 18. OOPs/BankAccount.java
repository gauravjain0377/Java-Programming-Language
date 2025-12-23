public class BankAccount {
    public static void main(String[] args) {

        Account myAcc = new Account();
        myAcc.username = "GauravJain";
        // myAcc.password = "ABDHDFDCVDBB";
        myAcc.setPassword("ABCDDD");

        System.out.println(myAcc.username);
       
        
    }
}

class Account {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}