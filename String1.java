package practice;


import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) {
        	System.out.println("Yes");
        }
        else
        	System.out.println("No");
        
        // startIndex : starting index is inclusive
        // endIndex : ending index is exclusive
        String newA = "";
        String newB = "";
        if (A.length() > 1) {
        	newA = A.substring(0,1).toUpperCase() + A.substring(1);
        }
        if (A.length() == 1){
        	newA = A.substring(0,1).toUpperCase();
        }
        if (B.length() > 1) {
        	newB = B.substring(0,1).toUpperCase() + B.substring(1);
        }
        if (A.length() == 1){
        	newB = B.substring(0,1).toUpperCase();
        }

        System.out.println(newA + " " + newB);
    }
}
