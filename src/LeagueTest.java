import java.util.Random;
import java.util.Scanner;

public class LeagueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a temperature for the first game, in F ");
        int temp1 = sc.nextInt();
        System.out.println("Give a temperature for the second game, in F ");
        int temp2 = sc.nextInt();
        System.out.println("Give a temperature for the third game, in F ");
        int temp3 = sc.nextInt();
        System.out.println("Give a temperature for the fourth game, in F ");
        int temp4 = sc.nextInt();

        //too cold, game is cancelled, warm, game goes on
        //use randomizer to pick team line-ups
    }

    public void runGame(Teams t1, Teams t2) {
        //put two teams against each other, randomly assign scores using a random generator
        Random rn = new Random();

    }

}
