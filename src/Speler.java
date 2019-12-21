public class Speler extends Sessie {
    protected static String naam;
    protected static double score;
    protected int zetten;

    public Speler(String naam, double score, int zetten) {
        this.naam = naam;
        this.score = score;
        this.zetten = zetten;
    }

    public Speler() {

    }

    public String getNaam() {
        return naam;
    }

    public double getScore() {
        return score;
    }

    public int getZetten() {
        return zetten;
    }
}
