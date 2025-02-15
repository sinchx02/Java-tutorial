public class StaticExample {
    String name;
    int roll;
   static int std;
    public void printAll()
    {
        System.out.println("name: "+name+" roll: "+roll+" std: "+std);
    }

    static //initialize static variables;
    {
        std = 10;

        //static block will be called when class is loaded even before main function
        //can not access instance variables and methods. only the static var and methods 
    }
    public static void main(String[] args) 
    {
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();

        s1.name="Anu";
        s1.roll=2;
        //StaticExample.std=11;

        s2.name="Ram";
        s2.roll=4;
        
        s1.printAll();;
        s2.printAll();

        }
    }