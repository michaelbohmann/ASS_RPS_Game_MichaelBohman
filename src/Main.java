import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        String playerA = "";
        String playerB = "";

        while (playAgain) {
            do {
                System.out.print("Player A, enter your move [R, P, S]: ");
                playerA = scanner.nextLine().toUpperCase();
            } while (!isValidMove(playerA));

            do {
                System.out.print("Player B, enter your move [R, P, S]: ");
                playerB = scanner.nextLine().toUpperCase();
            } while (!isValidMove(playerB));


            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock ties Rock!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
                else
                {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper ties Paper!");
                }
                else
                {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }
            else
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                }
                else
                {
                    System.out.println("Scissors ties Scissors!");
                }
            }


            System.out.print("Would you like to play again? (Y/N): ");
            String response = scanner.nextLine().toUpperCase();
            playAgain = response.equals("Y");
        }
    }


    public static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S");
    }
}