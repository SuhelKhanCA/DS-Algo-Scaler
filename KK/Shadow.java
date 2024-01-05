public class Shadow {
   static int x=50; // Shadowed at line 
    public static void main(String[] args) {
        System.out.println(x);

        int x=100;
        System.out.println(x);
    }
}
