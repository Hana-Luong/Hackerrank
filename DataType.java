package practice;

import java.util.Scanner;


class DataType{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); //T, the mx number of test case

        for(int i=0;i<t;i++)    //n, test case iteration
        {   //byte, short, int, long
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");   
                sc.close();
                
                if(x < -2147483648 || x > 2147483647) 
                {
                    System.out.println("* long");
                }
                else 
                {   
                    if(x>=-128 && x<=127)
                    {
                        System.out.println("* byte");
                        System.out.println("* short");
                        System.out.println("* int"); 
                        System.out.println("* long");
                    } 
                    if((x>=-32768 && x <-128) || 
                        (x >127 && x<=32767))
                    {
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                     }
                    if((x >= -2147483648 && x < -32768) 
                    		|| (x > 32767 && x <= 2147483647)) 
                    {
                        System.out.println("* int");
                        System.out.println("* long");                                 }
                	}  
                	//put an else
            	
                
            }              
                
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
