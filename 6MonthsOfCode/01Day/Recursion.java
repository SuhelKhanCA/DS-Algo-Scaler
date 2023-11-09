class Recursion{

   static int fn(int n){
        if(n==1)
            return 1;
        else
            return n + fn(n-1);
    }
    public static void main(String args[]){

        System.out.println(fn(10));
    }
}