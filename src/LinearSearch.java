import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int s[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            s[i] = sc.nextInt(); 
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();
        LinearSearch l = new LinearSearch();
        int r = l.linearSearch(s, key);
        if(r==-1)
        {
            System.out.println("element not found");
        }
        System.out.println("the element "+key+" is found at"+r);
    }
    public int linearSearch(int s[], int key)
    {
        for(int i=0;i<s.length-1;i++)
        {
            if(key == s[i])
            return i;
        }
        return -1;
    }
}
