import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int rev =0 ;
        while(num>0){
            int rem = num%10;
            num/=10;
            rev = rev*10+rem;
        }
        System.out.println("The reverse of this no. is :"+rev);

        sc.close();
    }
}
