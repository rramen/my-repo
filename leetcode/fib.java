public class fib {
    public int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        fib f = new fib();
        System.out.printf("The 5th fibonacci number is %d%n", f.fibonacci(5));
        System.out.printf("The 10th fibonacci number is %d%n", f.fibonacci(10));
    }
};

// upper-bound runtime of O(2^n)

