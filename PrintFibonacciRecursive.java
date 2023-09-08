package pages ;
 
    public class printFibonacciRecursive {
         public static int fibonacci(int count) {
                if(count <= 1)
                return count;
         return fibonacci(count - 1) + fibonacci(count - 2);
    }
    public static voidmain (String []args) {
        int seqLength = 10;
        System.out.print("A Fibonacci sequene of" + seqLength + "numbers :");
        for(int i = 0 ; i< seqLength; i++){
            System.out.print(fibonacci(i) + " ");
    }
    }
 }
