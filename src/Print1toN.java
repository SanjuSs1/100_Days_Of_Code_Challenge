import java.util.*;
public class Print1toN {

	public static int[] printNos(int x) {
        int []ans = new int[x];

       recursiveFunction(x, ans);

       return ans;
   }

   public static void recursiveFunction(int x, int []ans) {
       if(x == 0) {
           return;
       }

       recursiveFunction(x - 1, ans);
       ans[x - 1] =x;
   
   }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int[] result=printNos(n);
	//	recursiveFunction(n,result);
		System.out.println(result);
		

	}

}
