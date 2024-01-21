import java.util.Scanner;
public class Fibo2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter nth term: ");
       int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");

        for(int i=2; i<=num; i++){
		int tmp = n2;
		n2= n1+n2;
		n1=tmp;
		System.out.print(n2+" ");
	    }
    }
}
