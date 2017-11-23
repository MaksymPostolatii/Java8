package eight.tasks.functionalinterface;

import eight.tasks.streams.RapAlbum;
import util.RomanNumber;

import java.util.function.Function;

import static eight.tasks.streams.ListOfRapAlbums.getListWithTopTenRapAlbums;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.time.LocalDate.now;
import static util.Constants.*;

public class FunctionalInterfaceTaskUpdated {

    public static void printResults() {
        out.println(format(CHRONIC_RELEASE_ARABIC, CHRONIC, getAlbumReleaseYear(CHRONIC)));
        out.println(format(CHRONIC_RELEASE_ROMAN, CHRONIC, getConvertedReleaseYear(CHRONIC)));
    }

    private static String getConvertedReleaseYear(String album) {
        Function<Integer, String> intToRoman = RomanNumber::convertIntegerToRomanNumber;
        return intToRoman.apply(getAlbumReleaseYear(album));
    }

    private static int getAlbumReleaseYear(String album) {
        return getListWithTopTenRapAlbums().stream()
                .filter(rapAlbum -> rapAlbum.getAlbum().equals(album))
                .mapToInt(RapAlbum::getReleaseYear).findFirst().orElse(now().getYear());
    }


}
