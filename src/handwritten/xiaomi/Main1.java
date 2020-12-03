package handwritten.xiaomi;

public class Main1 {
    public static void main(String[] args) {
        String s="PPALLP";
        String s1="PPALLL";
        System.out.println(checkRecord(s));
        System.out.println(checkRecord(s1));
    }

    public static boolean checkRecord(String s){
        int count = 0;
        char [] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='A') count++;
            if (count>=2) break;
        }
        if (count >= 2|| s.indexOf("LLL")!= -1) return false;
        else return true;

    }
}
