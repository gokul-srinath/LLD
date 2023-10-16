package TicTacToe;

public class TicTacToe {
    private final int[][] board;
    private final int[] rowSum,colSum;
    private int diagSum, diagRevSum;
    private final int n = 3;



    public TicTacToe () {
        this.board = new int[n][n];
        this.rowSum = new int[n];
        this.colSum = new int[n];
        this.diagSum = 0;
        this.diagRevSum = 0;
    }


    public int move(int player,int row,int col) throws IllegalArgumentException{
        if(row < 0 || row >= n || col <0 || col >= n) {
            throw new IllegalArgumentException("Out of Boundary");
        }else if(board[row][col]!=0) {
            throw new IllegalArgumentException("Square Already Played!");
        }else if(player != 0 && player != 1){
            throw new IllegalArgumentException("Invalid Player");
        }else{
            int move  = player == 0 ? -1 : 1;
            board[row][col] = move;

            rowSum[row] += player;
            colSum[col] += player;

            if(row == col) {
                diagSum+=player;
            }

            if(row ==  n -1 -col) {
                diagRevSum+=player;
            }

            if(rowSum[row] == Math.abs(n) || colSum[col] == Math.abs(n) || diagSum == Math.abs(n) || diagRevSum == Math.abs(n)) {
                return player;
            }
            return 0;
        }
    }






}
