import java.util.zip.Checksum;

public class interfaceOOPS {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook horse = new Rook();
        horse.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessMoves{
    void moves();
}

class Queen implements ChessMoves{
    public void moves(){
        System.out.println("quees moves : left, right, up, down, diagonal - (every direction)");
    }
}

class Rook implements ChessMoves{
    public void moves(){
        System.out.println("Rook moves : 2.5moves in every direction, left-right, up-down, diagonal");
    }
}

class King implements ChessMoves{
    public void moves(){
        System.out.println("moves in every direction but just one step");
    }
}