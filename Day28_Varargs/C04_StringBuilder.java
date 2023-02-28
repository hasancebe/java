package Day28_Varargs;

public class C04_StringBuilder {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb=new StringBuilder("java is beatifully is");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.lastIndexOf("b"));
        System.out.println(sb.replace(1,6,"hasan"));
        System.out.println(sb.subSequence(1,sb.length()));
        sb.append("java").insert(3,"aaa").insert(2,"lll");
        System.out.println(sb);
        String as="abcdefghj";
        System.out.println(as.substring(7,6).length());
    }
}
