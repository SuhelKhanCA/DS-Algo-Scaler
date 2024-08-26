class UppsercaseToLowercase{
    public static void main(String[] args) {
        String str = "Hello WorLd";
        System.out.println("Original String: " + str);
        // System.out.println("Required String: " + upperToLower(str));
        char[] charArray = str.toCharArray();

        for(int i=0; i< charArray.length; i++){
            char ch = charArray[i];
            if(ch >= 'A' && ch <= 'Z'){
                charArray[i] = (char)(ch - 'A' + 'a');
            }
            else if(ch >= 'a' && ch <= 'z'){
                charArray[i] = (char)(ch - 'a' + 'A');
            }
        }
        System.out.println("Required String: " + new String(charArray));

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

// char[] charArray = str.toCharArray();

// for(int i=0; i< charArray.length; i++){
//     char ch = charArray[i];
//     if(ch >= 'A' && ch <= 'Z'){
//         charArray[i] = (char)(ch - 'A' + 'a');
//     }
//     if(ch >= 'a' && ch <= 'a'){
//         charArray[i] = (char)(ch - 'a' + 'A');
//     }
// }