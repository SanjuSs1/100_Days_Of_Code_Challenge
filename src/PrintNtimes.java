
public class PrintNtimes {
    public static void printNtimes(int n){
        int i=1;
        print(i, n);
    }
    public static void print(int i,int n){
        if(i>n)
        {
            return;
        }
        else
        {
            System.out.print("Coding Ninjas"+" ");
            print(i+1,n);
        }
    }
    public static void main(String []args)
    {
    	printNtimes(6);
    }
}