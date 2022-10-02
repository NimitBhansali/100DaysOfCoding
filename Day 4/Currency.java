import java.util.*;
import java.text.*;
public class Currency {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us , india,china,france;
        us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);        
        india= NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

