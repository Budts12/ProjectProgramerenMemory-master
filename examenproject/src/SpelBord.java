import java.lang.reflect.Array;
import java.util.Random;

public class SpelBord extends Sessie {
    Random rand = new Random();
    public int rooster;
    public int x;
    public int y;
    public Object tip;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPositie() {
        this.x = x;
        this.y = y;
    }

    public int getkiesGrootte() {
        return rooster;
    }

    public int vulBord() {
        return rooster;
    }

    public Object tipKaart() {
        return rooster;

    }

    public Object kaartActief() {
        return rooster;

    }
}
    //public static  Object[][] main (String[]args) {
       // Object[][] memory = new Object[4][5]; //
      // Object x = (Object) Array.get(4, 5);
       // tijani heeft vragen voor tutors


