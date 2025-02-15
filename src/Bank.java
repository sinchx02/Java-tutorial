public class Bank {

    public static void main(String[] args) {

        BankClass b1=new BankClass();
        b1.setAccntno(45554353);
        b1.setBalance(5457.00);
        b1.setName("Anu");

        System.out.println(b1.getName()+" "+b1.getAccntno()+" "+b1.getBalance());
        
    }
}
