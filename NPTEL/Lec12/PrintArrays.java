public class PrintArrays {
    // Defining a static method to print an array of integer
    static public void print(int[] a){
        System.out.print("[ "+ a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(" "+a[i]+ " ");
        }
        System.out.println(" ]");
    }
    // The following is an overloaded method to print data if any type
    public static void print(Object[] a){
        System.out.print("[ "+ a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(" " + a[i]+ " ");
        }
        System.out.println(" ]");
    }
    // Defining main method
    public static void main(String[] args){
        int[] a = {11, 22, 33, 660}; // create an array of integers
        print(a);

        int[] b = (int[])a.clone(); // duplicate a[] in b[]
        print(b);

        String[] c = {"AA", "BB", "CC", "DD"}; // Create an array of strings
        print(c);

        String[] d = (String[])c.clone();
        print(d);

        c[1] = "XYZ";
        print(c);
        print(d);
    }
}
