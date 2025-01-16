public class InvertCase {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(invertCase(str));
    }

    static String invertCase(String str) {
        
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            
            if (ch >= 'A' && ch <= 'Z') {
                charArray[i] = (char) (ch - 'A' + 'a');
            }
            else if (ch >= 'a' && ch <= 'z') {
                charArray[i] = (char) (ch - 'a' + 'A');
            }
        }

        return new String(charArray);
    }
}
