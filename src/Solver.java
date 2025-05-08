import java.util.Scanner;
public class Solver {
    static int[][] board = Puzzles.getBoard(0);

    public static void main(String [] args) {
        Puzzles.print(board);
        solve();
        Puzzles.print(board);
    }

    public static void solve() {
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to solve puzzle");
        s.nextLine();

        //your code goes here
    }


}
