import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        prime(num);
    }
    static void prime(int n){
        int c=2;
        if(n%c*c==0){
            System.out.println("Not prime");
        }else{
            c++;
            if(n%c*c!=0){
                System.out.println("Prime");
            }
        }
    }
}
