
public class SumOfFirstNno {
    public static int sumFirstN(int n) {
        if(n==0 || n==1)
        {
            return n;
        }
        
            int result=sumFirstN(n-1);
            return n+result;
    
    }

	public static void main(String[] args) {
		int result=sumFirstN(10);
		System.out.println(result);

	}
}
