/*
 Task: 
Given  names and phone numbers, assemble a phone book that maps friends' names to their respective 
phone numbers. You will then be given an unknown number of names to query your phone book for; for each queried,
print the associated entry from your phone book (in the form ) or  if there is no entry for.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

Input Format

The first line contains an integer,N , denoting the number of entries in the phone book. 
Each of the N subsequent lines describes an entry in the form of 2 space-separated values on a single line. 
The first value is a friend's name, and the second value is an 8-digit phone number.

After the N lines of phone book entries, there are an unknown number of lines of queries. Each line (query) 
contains a name to look up, and you must continue reading lines until there is no more input.

Note: Names consist of lowercase English letters and are first names only.

Constraints
    1 <= N <= 10^5
    1 <= queries <= 10^5

 */

package hackerranktest8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author besthon1
 */
public class Hackerranktest8 {

    /**
     * @param args the command line arguments
     */
    
    static Map<String, Integer> phoneBook = new HashMap<String, Integer>();
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        int n = -1;
        
        do{
            System.out.print("Please, enter the number of contacts in the phone book: ");
            n = in.nextInt();
            
            if(n < 1)
                System.out.println("n has to be greater than 0");
        }
        while (n < 1);
        
        System.out.println("Please, enter " + n + " name(s), each followed by its phone number: "); 
        for(int i = 0; i < n; i++)
        {
             String name = in.next();
            int phone = in.nextInt();
            
            //adding contacts into phone book
            phoneBook.put(name, phone);
        }
        
        
         System.out.print("Name to search: "); 
        //searching for a given name in the phone book
        while(in.hasNext())
        {
            String s = in.next();
            
            if(phoneBook.containsKey(s))
            {
                // int phoneNumber = phoneBook.
                System.out.println( s + " = "+ phoneBook.get(s) );
             
            }
            else
            { 
                System.out.println("Not found");
            }
            System.out.println();
            System.out.print("Name to search: ");
       }
        in.close();
    }
    
}
