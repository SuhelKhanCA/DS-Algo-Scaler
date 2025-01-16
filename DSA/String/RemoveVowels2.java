public class RemoveVowels2 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(removeVowels(str));

    }

    public static String removeVowels(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< str.length(); i++){

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            
            sb.append(ch);
        }

        return sb.toString();
    }
}
