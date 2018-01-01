public class HelloWorld{

    public static void main(String []args){
        System.out.println(stringCompression("aaabbbcccccaddbb"));
        System.out.println(stringCompression("asdibad"));
        System.out.println(stringCompression("AaBBbccC"));
     }
    
    public static String stringCompression(String s){
        if(s == null || s.length() <=1 ){
            return s;
        }
        String compS = Character.toString(s.charAt(0));
        int count = 1;
        int num = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count ++;
            }else{
                if(count > 1) num ++;
                compS += count;
                compS += s.charAt(i);
                count = 1;
            }
            if(i == s.length()-1){
                compS += count;
            }
        }
        if(num > 0) return compS;
        return s;
    }
    
}
