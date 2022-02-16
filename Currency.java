package practice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        String france = frFormat.format(payment);
        String china = cnFormat.format(payment);
          
        //0<= payment <= 10^9
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}