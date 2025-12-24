public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        // ChessPlayer p = new Queen();  => This is also correct (Better Polymorphic Version)
        // p.moves();

    } 
    
}


interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
   public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
   public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
   public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 step");
    }
}