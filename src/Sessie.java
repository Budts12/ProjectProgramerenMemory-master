import java.util.Timer;

public class Sessie {
Timer timer;
protected Object spelerid;
public Sessie(){
}
    private Sessie(int seconds) {
        timer = new Timer();
    }
private Object getSpeleridd(){
        return this.spelerid;
}

}

