//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map< String,String> phoneBook = new HashMap< String,String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            // Assigns map (keys,value)
            phoneBook.put(name,phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            
      // s is the next line of the input, this determines if map contains the string
            if (phoneBook.containsKey(s))
            {
                System.out.println(s+"="+phoneBook.get(s));
            }
            // Error check, f it doesn't exist print "Not Found"
            else
            {
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}

