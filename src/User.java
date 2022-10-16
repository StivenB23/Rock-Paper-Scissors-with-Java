import java.util.Scanner;
public class User {
    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove(){
       System.out.println("Rock, Paper or Scissors?");
       String userInput = inputScanner.nextLine().toUpperCase();
       char firstLetter = userInput.charAt(0);

        if(firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S' ){
            
            switch (firstLetter) {
                case 'R':
                    return Move.ROCK;
                case 'P':
                    return Move.PAPER;
                case 'S':
                    return Move.SCISSORS;
                }
        }

        return getMove();
    }

    public boolean playAgain(){
        System.out.print("Do you want to play again?");
        String usuarioInput = inputScanner.nextLine().toUpperCase();
        return usuarioInput.charAt(0) == 'S';
    }
    

}
