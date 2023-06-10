package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    //getter and setter methods
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}

public class Bank {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna Collage";
        account1.email = "apna-collage@gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
    
}
