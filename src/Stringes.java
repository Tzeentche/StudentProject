public class Stringes {

    public static void main(String[] args) {

        String s = new String("abc");
        String s2 = s.concat("def");
        System.out.println(s);
        System.out.println(s2);

        StringBuilder strBui = new StringBuilder();
        strBui.append("ghi");
        strBui.insert(0, "");
        System.out.println(strBui);

        StringBuffer strBuf = new StringBuffer();
        strBuf.append("jkl");
        strBuf.insert(0, "");
        System.out.println(strBuf);
    }


}
