package PATTERN;

public class pattern4 {

    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4 obj = new pattern4();
        obj.printTriangle(5);

    }
}

