public enum Move {
    ROCK, PAPER, SCISSORS;
    /**
     * Compara esta jugada con otra jugada para determinar empate, victoria o 
     * derrota.
     * @param userMove
     *         movimiento del usuario
     * @param computerMove
     *         movimiento de la maquina
     * 
     * @return 1 si esta jugada le gana a la otra, -1 si esta jugada pierde frente a 
     *         la otra, 0 si las jugadas empatan
     */
    public static int compareMoves(Move userMove,Move computerMove) {
        // Empate
        if (userMove == computerMove)
            return 0;

        switch (userMove) {
            case ROCK:
                return (computerMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (computerMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (computerMove == PAPER ? 1 : -1);
        }

        // Nunca debería llegar hasta aquí
        return 0;
    }
}
