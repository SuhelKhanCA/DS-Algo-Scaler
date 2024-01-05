public class Scope {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        {
            a = 99;
             System.out.println(a);
            int c = 100;
            /*
             * the vale 'a' is available to the inner block but vice versa is not true ,i.e,
             * variable inside inner block will not be available outside that block
             */
        }
        int c =55;
        System.out.println(a);
        System.out.println(c);
    }
}