
package bank;
public class CheckingAccount {
    private String name;
    private int balance;
    private String id;
    private double interestRate;
    public CheckingAccount(String name, int balance, String id){
        this.name = name;
        this.balance = balance;
        this.id = id;
        this.interestRate = 0.02;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setConsignar(int balance){
        this.balance += balance;

    }
    public void setRetiro(int balance){
        this.balance -= balance;
    }
    public double getMonthlyInterest(){
        return this.interestRate + this.balance;
    }
}