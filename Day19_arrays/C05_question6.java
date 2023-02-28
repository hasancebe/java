package Day19_arrays;

public class C05_question6 {
    public static void main(String[] args) {
        String [] array={"hasan", "mehmet","ali osman"};

        longestShortestWord(array);
    }

    public static void longestShortestWord(String[] arrarys){


        String longest=arrarys[0];
        String shortest= arrarys[0];

        for (int i = 1; i <arrarys.length ; i++) {

            if(shortest.length()>arrarys[i].length()){
                shortest=arrarys[i];

            }
            if(longest.length()<arrarys[i].length()) {
                longest = arrarys [i];
            }

        }
        System.out.println("shortest name: " + shortest+ "/ longest name: " +longest);
    }
}
