public class Fibonacii {
    
    static int fibonacci(int N){
            if(N <= 1){
                
                return N;
            }
            
            return fibonacci(N-1)+fibonacci(N-2);
          }
    public static void main(String[] args) {
       int N = 10;
       System.out.println(fibonacci(N));
    }
}