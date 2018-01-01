public class HelloWorld{

    public static void main(String []args){
        System.out.println(stringCompression("aaabbbcccccaddbb"));
        System.out.println(stringCompression("asdibad"));
        System.out.println(stringCompression("AaBBbccC"));
        System.out.println(stringCompression("a"));
        System.out.println(stringCompression("difentt"));
     }
//first Attempt     
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
    
 /* 1.使用String类的场景：在字符串不经常变化的场景中可以使用String类，例如常量的声明、少量的变量运算。 
 2.使用StringBuffer类的场景：在频繁进行字符串运算（如拼接、替换、删除等），并且运行在多线程环境中，则可以考虑使用StringBuffer，例如XML解析、HTTP参数解析和封装。 
 3.使用StringBuilder类的场景：在频繁进行字符串运算（如拼接、替换、和删除等），并且运行在单线程的环境中，则可以考虑使用StringBuilder，如SQL语句的拼装、JSON封装等。
作者：果子
链接：https://www.zhihu.com/question/20101840/answer/18901280
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    
}
