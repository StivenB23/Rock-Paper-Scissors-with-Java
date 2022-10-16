public class RockPaperScissors {
    private User user;
    private Computer computer;
    private int userPoints;
    private int computerPoints;
    private int numberOfGames;
    public RockPaperScissors(){
        this.user = new User();
        this.computer = new Computer();
        this.userPoints = 0;
        this.computerPoints = 0;
        this.numberOfGames = 0;
    }

    public static void main(String[] args) throws Exception {
       RockPaperScissors game = new RockPaperScissors();
       game.startGame();
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

    private void printGameStats() {
        int wins = userPoints;
        int losses = computerPoints;
        int ties = numberOfGames - userPoints - computerPoints;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;
    
        // Línea
        System.out.print("+");
        printDashes(70);
        System.out.println("+");
    
        // print
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %10s  |  %14s  |\n",
                "VICTORIES", "DEFEATS", "DRAWS", "GAMES", "PERCENTAGE W");
    
        // Línea
        System.out.print("|");
        printDashes(13);
        System.out.print("+");
        printDashes(11);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(14);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");
    
        // Imprime valores
        System.out.printf("|  %9d  |  %7d  |  %6d  |  %10d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);
    
        // Línea
        System.out.print("+");
        printDashes(70);
        System.out.println("+");
    }
    

    public void startGame(){
        System.out.println("ROCK, PAPER, SCISSORS!!");
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\n You played "+userMove+".");
        System.out.println("\n Computer played "+computerMove+".");
        int compareMoves = Move.compareMoves(userMove, computerMove);

        switch (compareMoves) {
            case 0: // Empate
                System.out.println("Empate!");
                break;
            case 1: // Gana Usuario
                System.out.println(userMove + " beats " + computerMove + ". You won!");
                userPoints++;
                break;
            case -1: // Gana Computadora
                System.out.println(computerMove + " beats " + userMove + ". You lost.");
                computerPoints++;
                break;
            }
            numberOfGames++;

            if(user.playAgain()){
                System.out.println("----------------------------------------------------------------");
                startGame();
            }else{
                printGameStats();
            }
    }



    
}
