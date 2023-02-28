package Day11_Stringmanipulations;

public class C01_replace_Regex {
    public static void main(String[] args) {
        String str="Learn   java, get the job";
        String str2="4567Learn 345667java, get the job456678";
        //change a at A
        System.out.println(str.replace('a', 'A'));
        System.out.println(str);
        System.out.println(str.replace("j", ""));
        System.out.println(str.replace("java", "hasan"));
        System.out.println(str.replace("java", "hasan").replace("get", "filiz"));

        System.out.println("--------------------");
        System.out.println(str.replaceFirst("a","ö"));


        //regex
        System.out.println(str.replaceFirst("\\s", "1"));
        System.out.println(str.replaceFirst("\\d","2"));
        System.out.println(str2.replaceAll("\\d",""));
        System.out.println(str.replaceAll("\\w","ö"));
        System.out.println(str2.replaceAll("\\D",""));
        System.out.println(str.replaceAll("\\W", ""));
        System.out.println("---------------------");
        System.out.println(str.replaceAll("\\S","ö"));
        System.out.println(str.replaceAll("\\s+","ş"));
        System.out.println(str.replaceAll("\\s","ş"));
    }
}
