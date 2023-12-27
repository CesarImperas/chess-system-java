package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    // Não deve expor o tabuleiro em outras classes, diferente do pacote do próprio tabuleiro (boardgame)
    protected Board getBoard() {
        return board;
    }

}
