package StringBuilder;

public class SB4 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Madina");
        StringBuffer sb2=new StringBuffer("Malikova ");
        sb1.append(sb2);
        System.out.println(sb1);
        System.out.println(sb2);


    }
}
