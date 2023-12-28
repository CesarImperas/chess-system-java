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
    public abstract boolean[][] possibleMoves();

    // Método concreto, utilizando um método abstrato
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
