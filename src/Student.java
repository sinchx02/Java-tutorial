// Write a Java program to store the marks of 5 students in an array and calculate:

// The total marks.
// The average marks.
// The highest mark.
import java.util.*;
public class Student 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int s[] = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            s[i] = sc.nextInt();
        }

        Student stud = new Student();
        int total = stud.totalMarks(s);
        double ag = stud.average(s, total);
        int hm = stud.highestMark(s);
        int sm = stud.secondHighest(s);

        System.out.println("total marks is "+total);
       System.out.println("average is "+ag);
        System.out.println("Highest marks is "+hm);
        System.out.println("Second highest marks is "+sm);

    }
    public int totalMarks(int s[])
    {
        int sum=0;
        for(int i:s)
            sum =sum+i;
  
            return sum;
    }

    public double average(int s[],int n)
    {
        double avg =n/(s.length);
        return avg; 
    }

    public int highestMark(int s[])
    {
        int max=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(s[i]>max)
            max=s[i];
        }
        return max;
    }

    public int secondHighest(int s[])
    {
        int max=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(s[i]>max)
            max=s[i];
        }
        int secondmax = s[0];
        for(int i=0;i<s.length;i++)
        {
            if(s[i]>secondmax && s[i]!=max)
            secondmax=s[i];
        }
        return secondmax;
    }
}