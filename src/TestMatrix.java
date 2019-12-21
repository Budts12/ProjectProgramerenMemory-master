import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
        SpelBord spelBord=new SpelBord();
        spelBord.vulBord();
        Scanner key = new Scanner(System.in);
        String[][] matrix = { //wij maken een array en vullen die met lege blokjes
                {"◘", "◘", "◘", "◘"},
                {"◘", "◘", "◘", "◘"},
                {"◘", "◘", "◘", "◘"},
                {"◘", "◘", "◘", "◘"},
                {"◘", "◘", "◘", "◘"}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("geef keuze x");
        int x = key.nextInt();
        System.out.println("geef keuze y");
        int y = key.nextInt();
        Kaart kaart1= spelBord.getKaart(x,y);

        matrix[x][y]=Integer.toString( kaart1.getValue());
        System.out.println(kaart1.getValue());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        /*
        if (x == 1)//als de positie gelijk is aan wat is ingegeven dan printen wij de array af met die kaart omgekeerd
            System.out.println(" {\"\\uD83C\\uDD30\", \"◘\", \"◘\", \"◘\"},\n" +
                    "                {\"◘\", \"◘\", \"◘\", \"◘\"},\n" +
                    "                {\"◘\", \"◘\", \"◘\", \"◘\"},\n" +
                    "                {\"◘\", \"◘\", \"◘\", \"◘\"},\n" +
                    "                {\"◘\", \"◘\", \"◘\", \"◘\"}");
    */}


}


