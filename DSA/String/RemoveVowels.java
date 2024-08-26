
class RemoveVowels{
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(removeVowels(str));
    }
    static String removeVowels(String str){
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(String.valueOf(str.charAt(i)))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
/*

for(int i=0; i< str.length(); i++){

    char ch = str.charAt(i);

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        continue;
    }
    Syso(ch);
}

 */