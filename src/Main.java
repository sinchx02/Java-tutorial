public class Main {
        public static void main(String[] args)
        {
            Main m = new Main();
            int r= m.add(3,5);
            int r1 = m.add(8,7,5);
            System.out.println(r);
            System.out.println(r1);
        }
        public int add(int n1,int n2)
        {
            int result=n1+n2;
            return result;
        }
        public int add(int n1,int n2, int n3)
        {
            int result =n1+n2+n3;
            return result;
        }
    }