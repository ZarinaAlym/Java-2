
package codingbat;

public class String1 {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("Mira"));
        System.out.println(firstHalf("Zarina"));

    }

      public static String helloName(String name) {
        return "Hello " + name+"!";
    }
        public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }
    public static String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
    public  static String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);

    }
    public static String extraEnd(String str) {
        return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }
    public static String firstTwo(String str) {
        if(str.length()<=2){
            return str;
        }
        return str.substring(0,2);
    }
    public static String firstHalf(String str) {
        return str.substring(0,str.length()/2);

    }
    public   static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
    public static String comboString(String a, String b) {
        if(a.length()>b.length()){
            return b+a+b;
        }
        return a+b+a;
    }
    public static String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }
    public static String left2(String str) {
        if(str.length()<=2){
            return str;
        }
        return str.substring(2,str.length())+str.substring(0,2);
    }
    public static String right2(String str) {
        if(str.length()<=2){
            return str;
        } return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
    public static String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }return str.substring(str.length()-1);

    }
    public static String withouEnd2(String str) {
        if(str.length()<=2){
            return "";
        }return str.substring(1,str.length()-1);
    }
    public static String middleTwo(String str) {
        return str.substring((str.length()/2)-1,(str.length()/2)+1);
    }









}

        