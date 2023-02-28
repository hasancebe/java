package Day44_Maps;

import java.util.Random;

public class filmName {
    public static String filmNameCreator(){
        String searchingFilm;
        String [] films={"FightClub" ,"LordOfRings","GodFather","BackToFuture","TheShawshankRedemption", "ForrestGump" ,"Matrix",
        "TheUsualSuspects","ThePianist","PulbFiction","Braveheart"};
        Random rdm=new Random();
        int a=rdm.nextInt(films.length);
        searchingFilm= films[a];
        return searchingFilm;
    }
}
