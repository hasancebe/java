package day17_Scope;

public class C03_ObjectVariables {
    public static void main(String[] args) {
        System.out.println(C02_ClassLevelVariable.hospitalname);
        System.out.println(C02_ClassLevelVariable.telnumber);
        int a= new C02_ClassLevelVariable().personelAge;
        a=32;

        C02_ClassLevelVariable.telnumber++;
        System.out.println(C02_ClassLevelVariable.telnumber);
    }
}
