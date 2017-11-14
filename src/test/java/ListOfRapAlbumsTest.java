import eight.tasks.streams.RapAlbum;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static eight.tasks.streams.ListOfRapAlbums.getListWithTopTenRapAlbums;
import static java.lang.String.format;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static util.Constants.*;

public class ListOfRapAlbumsTest {

    private List<RapAlbum> topTenRapAlbums = getListWithTopTenRapAlbums();

    @Test(description = "Verify that list with rap albums contains ten albums")
    public void verifyTopTen() {
        assertTrue(topTenRapAlbums.size() == 10, format(TOP_TEN_ERROR_MESSAGE, topTenRapAlbums.size()));
    }

    @Test(description = "Verify that list does not contain only Nas albums")
    public void verifyArtists() {
        assertFalse(topTenRapAlbums.stream()
                .allMatch(rapAlbum -> rapAlbum.getArtist().equals(NAS)), ARTIST_ERROR_MESSAGE);
    }

    @Test(description = "Verify that Chronic by Dr. Dre is present on the list")
    public void verifyChronic() {
        assertTrue(topTenRapAlbums.stream()
                .anyMatch(rapAlbum -> rapAlbum.getAlbum().equals(CHRONIC)), CHRONIC_ERROR_MESSAGE);
    }

    @Test(description = "Verify that list with three albums returned",
            dependsOnMethods = "verifyTopTen")
    public void verifyTopThree() {
        List topThreeRapAlbums = topTenRapAlbums.stream().skip(7).collect(Collectors.toList());
        assertTrue(topThreeRapAlbums.size() == 3, format(TOP_THREE_ERROR_MESSAGE, topThreeRapAlbums.size()));
    }

    @Test(description = "Verify that only one album by Notorious B.I.G returned")
    public void getOneAlbumByBiggie() {
        List albumsByNotorious = topTenRapAlbums.stream()
                .filter(rapAlbum -> rapAlbum.getArtist().equals(NOTORIOUS_BIG)).limit(1)
                .collect(Collectors.toList());

        assertTrue(albumsByNotorious.size() == 1,
                format(GET_ONE_ALBUM_BY_BIGGIE_ERROR_MESSAGE, albumsByNotorious.size()));
    }

    @Test(description = "Verify that the same albums does not return")
    public void verifyNotIdenticalAlbums() {
        topTenRapAlbums.add(new RapAlbum(NAS, ILLMATIC, 1994));
        assertTrue(topTenRapAlbums.size() == 11,
                format(NOT_IDENTICAL_ALBUMS_ERROR_MESSAGE, topTenRapAlbums.size()));

        topTenRapAlbums = topTenRapAlbums.stream().distinct().collect(Collectors.toList());
        assertTrue(topTenRapAlbums.size() == 10,
                format(NOT_IDENTICAL_ALBUMS_DISTINCT_ERROR_MESSAGE, topTenRapAlbums.size()));
    }
}
