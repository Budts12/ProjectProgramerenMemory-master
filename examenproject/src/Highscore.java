public class Highscore extends Speler {
    public Highscore(String naam, double score, int zetten) {
        Speler.naam =
                naam;
        Speler.score = score;
        this.zetten = zetten;
    }

    private Object getSpeleridd() {
        return this.spelerid;
    }
}
