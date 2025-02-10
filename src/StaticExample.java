public class StaticExample {
    String name;
    int roll;
    static int std;
    public void printAll()
    {
        System.out.println("name: "+name+" roll: "+roll+" std: "+std);
    }
    public static void main(String[] args) 
    {
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();

        s1.name="Anu";
        s1.roll=2;
        StaticExample.std=10;

        s2.name="Ram";
        s2.roll=4;
        
        s1.printAll();;
        s2.printAll();

        }
    }