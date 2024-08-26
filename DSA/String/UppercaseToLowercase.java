class UppsercaseToLowercase{
    public static void main(String[] args) {
        String str = "Hello WoLld";
        System.out.println("Original String: " + str);
        System.out.println("Required String: " + upperToLower(str));
    }
    static String upperToLower(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch >='a' && ch<= 'z'){
                sb.append(Character.toUpperCase(ch));
            }else if(ch >= 'A' && ch<= 'Z'){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }    
}