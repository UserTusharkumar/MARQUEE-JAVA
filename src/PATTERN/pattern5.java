package PATTERN;

public class pattern5 {

        void printTriangle(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            pattern5 obj = new pattern5();
            obj.printTriangle(5);
        }
    }

