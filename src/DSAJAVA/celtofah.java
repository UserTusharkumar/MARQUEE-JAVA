//celsiustofahrenheit

package DSAJAVA;

import java.util.*;

public class celtofah {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int c = scanner.nextInt();
        double f = (c * 1.8) + 32;
        System.out.println(f);
    }
}

