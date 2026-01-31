public class check {
public static boolean issafe(char board[][],int row ,int col){
    for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j=col+1;i>=0&&j<board[0].length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
public static boolean nqueen(char board[][],int row){
    if(row==board.length){
        
        return true;
    }
    for(int j=0;j<board.length;j++){
        if(issafe(board,row,j)){
        board[row][j]='Q';
        if(nqueen(board, row+1)){
            return true;
        }

        else{
            board[row][j]='X';
        }
        }
    }
    return false;
}
    public static void print(char board[][]){
        System.out.println("--------------------");
        for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.err.println();
    }
    }
public static void main(String[] args) {
    int n=4;
    char board[][]=new char[n][n];
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            board[i][j]='X';
        }
    }
    if(nqueen(board, 0)){
        print(board);
    }
}
}
