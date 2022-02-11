package practice;

/*each line of output there should be two columns

- first column contains the String and is left justified using exactly 15 characters.
- second column contains the integer, expressed in exactly  3 digits; 
if the original input < 3 digits, you must pad your output’s leading digits with zeroes.
*/

import java.util.Scanner;

public class Trailing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i<3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.format("%-15s%03d%n", s1, x);
        }
        sc.close();
        System.out.println("================================"); 
        
	}
}
/*
 - First of all we will use System.out.format();
 - Next we will use Modulus(%) within double quotes => System.out.format(“% “);
 - Next we will use ‘-‘ after modulus which will instruct the compiler of left indent, 
 - if you want to use right indent do not use “-“. 
 - 15 makes our String to be a minimum length of 15, it is required as per the

 - Second again we will put % and put 3d in order to format integer of a min length of 3. 
 -  %n will help to go to the next line 
 */