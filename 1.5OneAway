import java.util.Hashtable;
 import java.lang.Math;

public class HelloWorld{

    public static void main(String []args){
        System.out.println(ifOneAway("abcd", "dbca"));
        // System.out.println(ifOneAway("dca", "accdd"));
        // System.out.println(ifOneAway("aaaa", "a"));
        // System.out.println(ifOneAway("m b", "mdb"));
        // System.out.println(ifOneAway("+;;", ";;"));
     }
//first attempt     
/*    private static boolean ifOneAway(String a, String b){
        if(Math.abs(a.length()-b.length()) > 1){
            return false;
        }
        int[] table = new int[26];
        int countMinusOne = 0;
        int countOne = 0;
        int countOther = 0;
        for(char c : a.toCharArray()){
            int x = getCharValue(c);
            if(x != -1){
                table[x] ++ ;
            }
        }
        for(char c : b.toCharArray()){
            int y = getCharValue(c);
            if(y != -1){
                table[y] --;
            }
        }
        for(int i = 0; i<26; i++){
            if(table[i] == 1){
                countOne ++;
            }else if(table[i] == -1){
                countMinusOne ++;
            }else if(table[i] != 0){
                countOther ++;
            }
        }
        System.out.println("countOne: " + countOne);
        System.out.println("countMinusOne: " + countMinusOne);
        System.out.println("countOther: " + countOther);
        return (countOther == 0 && (countOne == 1 && countMinusOne == 0 || countOne == 0 && countMinusOne == 1 || countOne == 1 && countMinusOne == 1));
    }

    private static int getCharValue(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int v = Character.getNumericValue(c);
        if(v<=z && v>=a){
            return v-a;
        }
        return -1;
    }
*/ 
//second attempt
/*    private static boolean ifOneAway(String a, String b){
        if(Math.abs(a.length()-b.length()) > 1){
            return false;
        } 
        Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
        int countMinusOne = 0;
        int countOne = 0;
        int countOther = 0;
        for(char c : a.toCharArray()){
            if(!h.containsKey(c)){
                h.put(c,1);
            }else{
                h.put(c, h.get(c)+1);
            }
        }
        for(char c : b.toCharArray()){
            if(!h.containsKey(c)){
                h.put(c,-1);
            }else{
                h.put(c, h.get(c)-1);
            }
        }
        for (int val : h.values()){
            if(val == 1){
                countOne ++;
            }else if(val == -1){
                countMinusOne ++;
            }else if(val != 0){
                countOther ++;
            }
        }
        System.out.println("countOne: " + countOne);
        System.out.println("countMinusOne: " + countMinusOne);
        System.out.println("countOther: " + countOther);
        return (countOther == 0 && (countOne == 1 && countMinusOne == 0 || countOne == 0 && countMinusOne == 1 || countOne == 1 && countMinusOne == 1 || countOne == 0 && countMinusOne == 0));
    }
*/

//third attempt    
    private static boolean ifOneAway(String a, String b){
        if(Math.abs(a.length()-b.length()) > 1){
            return false;
        } 
        String s1 = a.length()>b.length()? a:b;
        String s2 = a.length()>b.length()? b:a;
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                System.out.println("1Diff");
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
                if(s1.length() == s2.length()){
                    index1 ++;
                    index2 ++;
                }else{
                    index1 ++;
                }
            }else{
                index1 ++;
                index2 ++;
            }
        }
        return true;
    }
    
}
