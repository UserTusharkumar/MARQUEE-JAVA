package Day14;

public class Decimaltobinary {
    public static void main(String[] args){
        int n = 10;
        int res = 0;
        int place = 1;

        while(n !=0 ){
                int rem = n % 2;
                res = res +(rem * place);
                place = place * 10;
                n = n / 2;
            }
            System.out.println(res);
        }
    }

//    Decimal to Binary



