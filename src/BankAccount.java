//constructor overloading

public class BankAccount {

    private int acctnum;
    private int initbal;
    private String name;

    public BankAccount()
    {
        System.out.println("Wlcome to Bank");
    }
    public BankAccount(int acctnum)
    {
        this.acctnum=acctnum;
        System.out.println("Account created with account number " +acctnum);
    }
    public BankAccount(int acctnum, int initbal)
    {
        this.acctnum=acctnum;
        this.initbal=initbal;
        System.out.println("Account created with account number " +acctnum+" and initial balance :"+initbal);
    }
    public BankAccount(int acctnum,int initbal,String name)
    {
        this.acctnum=acctnum;
        this.initbal=initbal;
        this.name=name;
        System.out.println("Account created with account number " +acctnum+", initial balance : "+initbal+" and Name:"+name);
    }

    public static void main(String[] args) {
        BankAccount b0 = new BankAccount();
        BankAccount b=new BankAccount(35436565);
        BankAccount b1=new BankAccount(35436565,800);
        BankAccount b2=new BankAccount(35436565,800,"Arthi");
    }
}
