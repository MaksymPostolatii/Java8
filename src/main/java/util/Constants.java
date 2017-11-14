package util;

import java.util.stream.Stream;

public class Constants {

    //dateTime constants
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String TIME_PATTERN = "hh:mm:ss";
    public static final String CURRENT_DATE = "Current date is: ";
    public static final String FIRST_DAY_OF_MONTH = "First day of current month is: ";
    public static final String CURRENT_DAY_OF_WEEK = "Current day of week is: ";
    public static final String CURRENT_TIME = "Current time is: ";
    public static final String INCREASED_TIME = "Time has increased by %d %s: %s";

    //rapAlbums constants
    public static final String NAS = "Nas";
    public static final String EMINEM = "Eminem";
    public static final String NOTORIOUS_BIG = "The Notorious B.I.G.";
    public static final String WU_TANG = "Wu-Tang Clan";
    public static final String TWO_PAC = "2Pac";
    public static final String DR_DRE = "Dr. Dre";
    public static final String NWA = "N.W.A.";
    public static final String FIFTY_CENT = "50 Cent";
    public static final String SNOOP_DOGG = "Snoop Dogg";
    public static final String ILLMATIC = "Illmatic";
    public static final String MARSHALL_MATHERS = "The Marshall Mathers";
    public static final String READY_TO_DIE = "Ready to Die";
    public static final String ENTER_THE_WU_TANG = "Enter the Wu-Tang";
    public static final String ALL_EYEZ_ON_ME = "All Eyez on Me";
    public static final String CHRONIC = "The Chronic";
    public static final String STRAIGHT_OUTTA_COMPTON = "Straight Outta Compton";
    public static final String LIFE_AFTER_DEATH = "Life After Death";
    public static final String GET_RICH_OR_DIE_TRYIN = "Get Rich or Die Tryin";
    public static final String BLUE_CARPET_TREATMENT = "Tha blue carpet treatment";
    public static final String RAP_ALBUM_TO_STRING = "RapAlbum{artist='%s', album='%s', releaseYear=%d}";
    public static final String TOP_TEN_ERROR_MESSAGE = "List size should be 10, not the%d";
    public static final String ARTIST_ERROR_MESSAGE = "Why only NAS?";
    public static final String CHRONIC_ERROR_MESSAGE = "Where is Chronic by Dr. Dre?";
    public static final String TOP_THREE_ERROR_MESSAGE = "This is top 3, not the top %d";
    public static final String GET_ONE_ALBUM_BY_BIGGIE_ERROR_MESSAGE = "There is should be only one album by Notorious B.I.G, not%d";
    public static final String NOT_IDENTICAL_ALBUMS_ERROR_MESSAGE = "List size should be 11, not the %d";
    public static final String NOT_IDENTICAL_ALBUMS_DISTINCT_ERROR_MESSAGE = "List size should be 10 after distinct, not the %d";

    //functionalInterface constants
    public static final String MESSAGE_FROM_DEFAULT_METHOD = "Message from default method";
    public static final String MESSAGE_FROM_OVERRIDE_METHOD = "Message from override method";

    //main
    public static final String DIVIDER = "\n*********************\n%s\n*********************\n";
    public static final String DATE_TIME = "DateTime API";
    public static final String OPTIONAL = "Optional class";
    public static final String FUNCTIONAL_INTERFACE = "Functional interface";

    private Constants() {
    }

}
