package Heroes;

public class Heroes_SixStars {

    private static Faction fortress = new Faction("Fortress");
    private static Faction abyss = new Faction("Abyss");
    private static Faction forest = new Faction("Forest");
    private static Faction shadow = new Faction("Shadow");
    private static Faction light = new Faction("Light");
    private static Faction dark = new Faction("Dark");

    public static Fodder FortressFodder = new Fodder(fortress, 6, "heroes/FortressHolder-3-icon.png");

    public static Heroes Mihm = new Heroes("Mihm", dark, 6, "heroes/Mihm-5-icon.png");
}
