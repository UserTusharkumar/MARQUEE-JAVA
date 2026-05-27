package DSAJAVA;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}


class loopslearn {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for(int i=1;i<=5;i++){
            System.out.println(n+" * "+i+" = "+i*n);

        }
    }
}

