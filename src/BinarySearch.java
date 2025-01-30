//iterative binary search
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int s[] = new int[n];
        // assume n = 5; then your array (s) wil be: {0,0,0,0,0}
        System.out.println("Enter sorted array");
<<<<<<< HEAD
        for(int i=0; i<n;i++)
=======

        //So, when you use a for each loop:
        // for(int i : s) => int i here will refer to the elements in the empty array, which is 0
        // s[i] => here, s[i] will always be s[0]
        // s[0] will take in the user's input using sc.nextInt() and keep overriding the 0th index.
        for(int i:s)
>>>>>>> 613f3128210700b9efc7215405ea59ccff403dac
        {
            s[i]=sc.nextInt();
        }

        // Correct implementation:
        
        // for(int i=0; i<n; i++) {
        //     s[i] = sc.nextInt();
        // }
        
        System.out.println("Enter key to be found");
        int key = sc.nextInt();
        
        BinarySearch b = new BinarySearch();
        int r =b.search(s,key);
<<<<<<< HEAD
        if(r==0)
        System.out.println("key "+key+" not found");
        else
        System.out.println("key "+key+ " found at index "+r);
=======
        
        if(r==0){
            System.out.println("key "+key+" not found");
        }
        else{
            //Make use of the index value that is being returned from the search() function
            System.out.println("key"+key+ "found");
            //System.out.println("key"+key+ "found at index: " + r);
        }
>>>>>>> 613f3128210700b9efc7215405ea59ccff403dac
        
    }
    public int search(int s[],int key)
    {
<<<<<<< HEAD
        int low=0;
        int high =s.length-1;
=======

        // you are assigning low and high to the first and last elements of the array
        // this will result in array being out of bounds when calulating mid and using s[mid]
        // instead, assign low as the first index of the array and high as the last index of your array
        // now finding mid with your existing formula will work
        int low=s[0];
        int high = s[s.length-1];
        
>>>>>>> 613f3128210700b9efc7215405ea59ccff403dac
        while(low<=high)
        {
            int mid = (low + high)/2;

            //ALways use brackets to ensure you are not confused
            if(key == s[mid]){
                return mid;
            }
            
            if(key<s[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
<<<<<<< HEAD
        return -1;
=======

        // why are u returning 0?
        // 0 can be a potential index that can be returned if the key is found at the 0th index of the array
        // The reason we return a number here is to let us know that the key is not found
        // So usually we return -1
        return 0;
>>>>>>> 613f3128210700b9efc7215405ea59ccff403dac
    }

    
}
