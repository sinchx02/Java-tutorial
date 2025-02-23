public class Check extends BankAccount
{
    public Check()
    {
        System.out.println("Check Processed sucessfully");
    }

    public Check(int acctnum)
    {
        this();
        System.out.println("Check Processed sucessfully with account " +acctnum);
    }

    public static void main(String[] args) {
        //Check b0 = new Check();
        Check b=new Check(35436565);
        // Check b1=new Check(35436565,800);
        // Check b2=new Check(35436565,800,"Arthi");
    }
}
