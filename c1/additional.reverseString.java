public static String reverseString(String s){
    char[] reversed = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
        reversed[i] = s.charAt(s.length()-i-1);
    }
    return new String(reversed);
}

public static String reverseString(String s){
    if(s == null || s.length()==0){
        return s;
    }
    return reverseString(s.substring(1))+s.charAt(0);
}
