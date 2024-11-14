public class OccurencesOfChars {

    public static void main(String[] args) {
        String str = "abcdabehf";
        int hash[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }

        System.out.println(hash['b' - 'a']);
    }
}