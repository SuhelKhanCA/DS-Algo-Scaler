//import java.util.Scanner;

public class FreqOfNum{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n = 1385757879;
        int c=0;
        String str =Integer.toString(n);
        // for(int i=0; i<str.length(); i++){
        //     if(i==7){
        //         c++;
        //     }
            
        // }/
        for(int i = 0; i<str.length(); i++){
        if(str.charAt(i)=='7'){
            c++;
        }
        }
        System.out.println("total frequency: "+c);

        /* INTEGER SOLUTION
         * while(n>0)
         *      rem = n%10
         *      n = n/10
         *      if(rem==3)
         *          count++
         * syso(count)
         */
    }
}