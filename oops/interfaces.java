class interfaces{
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}

interface Chessplayer{
    void moves();
}

class queen implements Chessplayer{
 public void moves(){
    System.out.println("up,down,left ,right");
 }
}

class rook implements Chessplayer{
 public void moves(){
    System.out.println("up,down,left ,right");
 }
}

class king implements Chessplayer{
 public void moves(){
    System.out.println("up,down,left ,right");
 }
}