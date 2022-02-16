package practice;

import java.util.Scanner;

public class Stringsubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
//did not address constraint
// 