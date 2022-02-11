package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class LoopSimpleMath {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // 2 <= N <= 20
        // 1 <= i <= 10
        if (N >= 2 && N <= 20)
        {
        	for(int i = 1; i <= 10; i++)
        	{
        		System.out.println(N + " x " + i + " = " + N*i);
        	}
        }        

        bufferedReader.close();
    }
}
