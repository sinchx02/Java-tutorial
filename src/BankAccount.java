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
        this(656576, 775);
        this.acctnum=acctnum;
        System.out.println("Account created with account number " +acctnum);
    }
    public BankAccount(int acctnum, int initbal)
    {
        this(786876, 778, "Sweety");
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
        //Check b0 = new Check();
        BankAccount b=new BankAccount(35436565);
        // Check b1=new Check(35436565,800);
        // Check b2=new Check(35436565,800,"Arthi");
    }
    
}

