package N_Java_Day_to_Day.day_48_OOP_InheritanceIntro;

public class BankAccount {
    public static String bankName;
   public String firstName;
   public String lastName;
   public BankAccount(String firstName,String lastName){
     this.firstName=firstName;
     this.lastName=lastName;
   }
   static {
       bankName="Bank Of America";
   }
    private String accountHolder;
    private long   accountNumber;
    private double accountBalance;
    public String getAccountHolder(){
    return accountHolder;}
    public void setAccountHolder(String accountHolder){
    this.accountHolder=accountHolder;}
    public long getAccountNumber(){
        return accountNumber;}
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;}
    public double getAccountBalance() {
        return accountBalance;}
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;}
    public void deposit(double amount){
        System.out.println("depositing : $"+amount);
        accountBalance+=amount;}
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid balance");
            return;
        }

        if (amount>accountBalance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing : $"+amount);
        accountBalance-=amount;
    }
    public void availableBalance(){
        System.out.println("AvailableBalance: $"+getAccountBalance());}
    public String toString(){
        return bankName+
                "\n========================================="+
                "\n"+ firstName +"  "+ lastName +
                "\nAccount Number"+getAccountNumber()+
                "\n========================================="+
                "\nBalance: $"+getAccountBalance();}
    }

