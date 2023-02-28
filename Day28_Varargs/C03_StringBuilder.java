package Day28_Varargs;

public class C03_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder(7);

        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//0
        sb.append("java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append('k'));
        System.out.println(sb.append(" is beatiful"));
        System.out.println(sb.capacity());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.reverse());
        System.out.println(sb.insert(7,"XXX"));
    }
}