package Function;
//Write a program which return type of integer sum of integer like sum of even number
// between start and end including them

//write a function to count digits of the number(return type - int)

//public class Bracket {
//
//    public static int sumEven(int start, int end) {
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        System.out.print(a + b);
//    }
//}

//create a function with parameter and arguments.
//Calculate nCr and pCr using factorial method(optimed will be discussed later).
//write a function which returns the sum of all the even function b/w n and m given as parameter.
//write a function to count digits in a number.
//write a function to demonstrate the string concatination, like a personalized greeting. Name passed arguments
//write a function to check if a second last digit of number is even or not(Boolean return type).
//Given the integer as parameter replace all the zeros in the digit with 5.




//write a function to check if a second last digit of number is even or not(Boolean return type).
    public class bracket {

        public static boolean issecond(int N) {
            int count = 0;
            while (N > 0) {
                count++;
                if (count == 2) {
                    int dig = N % 10;

                    if (dig % 2 == 0) {
                        return true;
                    }
                }
                N = N / 10;
            }

            return false;
        }

        public static void main(String[] args) {
            System.out.println(issecond(1234));
        }
    }