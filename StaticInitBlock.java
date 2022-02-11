package practice;

import java.util.Scanner;

/*
Java Static Initializer Block
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
It's time to test your knowledge of Static initialization blocks. You can read about it here.
You are given a class Solution with a main method. Complete the given code so that it outputs the 
area of a parallelogram with breadth B and height H. You should read the variables from the standard input.
If B≤0 or H ≤0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
Input Format
There are two lines of input. The first line contains B: the breadth of the parallelogram. 
The next line contains H: the height of the parallelogram.
Constraints 
−100≤B≤100 
−100≤H≤100
Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/

public class StaticInitBlock {
	/*
	 * Static Variables: When a variable is declared as static, then a single copy
	 * of the variable is created and shared among all objects at a class level.
	 * Static variables are, essentially, global variables. All instances of the
	 * class share the same static variable.
	 * 
	 * We can create static variables at class-level only. See here static block and
	 * static variables are executed in order they are present in a program.
	 */
	static int B, H;
	static boolean flag = true;

	static //Static initialization blocks NEW TO ME
	{    	//https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println
            ("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        sc.close();
        //FORGOT TO ADDRESS 100+
	}
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
// end of class
