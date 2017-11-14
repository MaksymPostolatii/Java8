package eight.tasks.streams;

import java.util.ArrayList;
import java.util.List;

import static util.Constants.*;

public class ListOfRapAlbums {

    public static List<RapAlbum> getListWithTopTenRapAlbums() {
        List<RapAlbum> topTenRapAlbums = new ArrayList<>();
        topTenRapAlbums.add(new RapAlbum(NAS, ILLMATIC, 1994));
        topTenRapAlbums.add(new RapAlbum(EMINEM, MARSHALL_MATHERS, 2000));
        topTenRapAlbums.add(new RapAlbum(NOTORIOUS_BIG, READY_TO_DIE, 1994));
        topTenRapAlbums.add(new RapAlbum(WU_TANG, ENTER_THE_WU_TANG, 1993));
        topTenRapAlbums.add(new RapAlbum(TWO_PAC, ALL_EYEZ_ON_ME, 1996));
        topTenRapAlbums.add(new RapAlbum(DR_DRE, CHRONIC, 1992));
        topTenRapAlbums.add(new RapAlbum(NWA, STRAIGHT_OUTTA_COMPTON, 1988));
        topTenRapAlbums.add(new RapAlbum(NOTORIOUS_BIG, LIFE_AFTER_DEATH, 1997));
        topTenRapAlbums.add(new RapAlbum(FIFTY_CENT, GET_RICH_OR_DIE_TRYIN, 2003));
        topTenRapAlbums.add(new RapAlbum(SNOOP_DOGG, BLUE_CARPET_TREATMENT, 2006));

        return topTenRapAlbums;
    }

}
