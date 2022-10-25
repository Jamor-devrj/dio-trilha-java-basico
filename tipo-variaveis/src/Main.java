import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        
        double R = sc.nextDouble();
        
        double volume = (4/3.0) * pi * Math.pow(R, 3.0);
        
        System.out.println("VOLUME = " + String.format("%.3f", volume));
        
        sc.close();
    }
 
}