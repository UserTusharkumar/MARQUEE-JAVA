package operators;

public class AssignmentOperators {
    public static void main(String [] args){

        int a = 23;
        int b = 3;

        System.out.printf("a += b : %d%n" +
                "a -= b : %d%n" +
                "a *= b : %d%n" +
                "a /= b : %d%n" +
                "a %%= b  %d%n",
                a += b, // a = a+b = 26
                a -= b, // a = a -b = 20
                a *= b, // a = a*b = 69
                a /= b,// a = a/b = 7
                a %= b); // a = a% b = 2

    }
}
