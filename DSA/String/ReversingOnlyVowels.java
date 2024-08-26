class ReversingOnlyVowels {
    public static void main(String[] args) {
        String str = "Hello World"; 
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (!isVowel(charArray[left])) {
                left++;
            } else if (!isVowel(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
