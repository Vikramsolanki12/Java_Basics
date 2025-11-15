class Customer{
    private String name;
    private  String password;
    private double balance;

    public void setBalance(double balance){
        boolean result = validateCustomer("vikram","vikram12");
        if(result){
            this.balance=this.balance+balance;
            System.out.println("deposited...");
            System.out.println("Total balance is: "+this.balance);
        }else {
            System.out.println("Invalid user or password....");
        }
    }
    public void getBalance(double balance) {
        boolean result = validateCustomer("vikram","vikram12");
        if(result){
            if(balance<=this.balance){
                double withdraw = balance;
                System.out.println(withdraw+" is credited successfully...");
                this.balance=this.balance-withdraw;
                System.out.println("Total balance is: "+this.balance);
            }else{
                System.out.println("Insufficient balace....");
            }
        }else{
            System.out.println("invalid username and password....");
        }
    }
    private boolean validateCustomer(String name , String password){
        return name.equalsIgnoreCase("Vikram") && password.equals("vikram12");
    }
}
public class BankingPortal {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setBalance(1000);
        c1.setBalance(4000);
        c1.getBalance(500);
        c1.getBalance(2200);
        c1.setBalance(500);
    }
}
