public class Kaart extends SpelBord {
    private boolean omdraaien;
    private boolean show;
    private boolean controle;
    private int value;

    public Kaart(boolean omdraaien, int value) {
        this.omdraaien = omdraaien;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isOmdraaien() {
        return omdraaien;
    }

    public boolean isShow() {
        return show;
    }

    public boolean isControle() {
        return controle;
    }
}
