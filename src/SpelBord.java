import java.lang.reflect.Array;
import java.util.Random;

public class SpelBord extends Sessie {
    Random rand = new Random();
    private Kaart[][] solution;
    private int x;
    private int y;
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

    public Kaart[][] getSolution() {
        return solution;
    }
    public Kaart getKaart(int x, int y){
     return solution[x][y];



    }

  /*  public int getkiesGrootte() {
        return rooster;
    }*/

    void vulBord() {
         solution = new Kaart[][]{
            {new Kaart(false,1), new Kaart(false,2), new Kaart(false,3), new Kaart(false,4)},
            {new Kaart(false,5), new Kaart(false,6), new Kaart(false,7), new Kaart(false,8)},
            {new Kaart(false,9), new Kaart(false,10), new Kaart(false,1), new Kaart(false,2)},
            {new Kaart(false,3), new Kaart(false,4), new Kaart(false,5), new Kaart(false,6)},
            {new Kaart(false,7), new Kaart(false,8), new Kaart(false,9), new Kaart(false,10)}};
    }

  /*  public Object tipKaart() {
        return rooster;*/

 /*   }

    public Object kaartActief() {
        return rooster;

    }*/
}
    //public static  Object[][] main (String[]args) {
       // Object[][] memory = new Object[4][5]; //
      // Object x = (Object) Array.get(4, 5);
       // tijani heeft vragen voor tutors


