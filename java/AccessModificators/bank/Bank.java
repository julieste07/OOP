package bank;
public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
    public Bank(){
        accountOne = new CheckingAccount("zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }
    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setConsignar(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setConsignar(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setConsignar(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setConsignar(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setRetiro(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setRetiro(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setRetiro(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setRetiro(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setRetiro(100);
        System.out.println("El dinero de la cuenta 1 es: " + bankOfGods.accountOne.getBalance());

        System.out.println("Su interes mensual es:" + bankOfGods.accountOne.getMonthlyInterest());




    }
    
}
