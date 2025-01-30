//iterative binary search
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int s[] = new int[n];
        System.out.println("Enter sorted array");
        for(int i=0; i<n;i++)
        {
            s[i]=sc.nextInt();
        }
        System.out.println("Enter key to be found");
        int key = sc.nextInt();
        BinarySearch b = new BinarySearch();
        int r =b.search(s,key);
        if(r==0)
        System.out.println("key "+key+" not found");
        else
        System.out.println("key "+key+ " found at index "+r);
        
    }
    public int search(int s[],int key)
    {
        int low=0;
        int high =s.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(key == s[mid])
            return mid;
            if(key<s[mid])
            high=mid-1;
            else
            low =mid+1;
        }
        return -1;
    }

    
}