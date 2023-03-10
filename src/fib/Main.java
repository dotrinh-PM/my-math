package fib;


public class Main {

    public static void main(String[] args) {
        Main m = new Main();
//        m.using_for();
//        m.using_while();
        m.using_recur();
    }

    public void using_recur() {
        int N = 10;
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            LogI(fib(i) + " ");
        }
    }

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }


    public void using_while() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int count = 0;
        LogI("fib: " + n1);
        while (count < 4) {
            n3 = n1 + n2;
            LogI("fib: " + n2);
            LogI("fib: " + n3);
            n1 = n3;
            n2 = n3 + n2;
            count++;
        }
    }

    public void using_for() {
        int n1 = 0, n2 = 1, n3, i, count = 9;
        LogI("fib: " + n1);
        LogI("fib: " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            LogI("fib: " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void LogI(String Message) {
        System.out.println("viewlog " + Message);
    }

}