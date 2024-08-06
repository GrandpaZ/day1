package N_Java_Day_to_Day.day_48_OOP_InheritanceIntro;

public class BOfa {
    public static void main(String[] args) {
        BankAccount obj=new BankAccount("abu","mmt");
        obj.setAccountHolder(obj.firstName+" "+obj.lastName);
        obj.setAccountNumber(123456789);
        obj.setAccountBalance(88);
        obj.availableBalance();
        obj.deposit(6888888);
        obj.availableBalance();
        obj.withdraw(520888);
        obj.availableBalance();
        System.out.println(obj);









    }
}
