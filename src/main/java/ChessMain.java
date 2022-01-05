import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {

//        Player whitePlayer= new Player("Beth", "beth@gmail.com", true, 2000, 20);
//        Player blackPlayer= new Player("Vasiliy", "vasiliy@gmail.com", false, 2500, 45);

//        System.out.println("White player: "+ whitePlayer.getName());
//        System.out.println("Black player: "+ blackPlayer.getName());

//        System.out.println(whitePlayer);
//        System.out.println(blackPlayer);
//
//        try{
//            whitePlayer.setRank(10000);
//            blackPlayer.setRank(-100);
//        }
//        catch (Exception err){
//            System.out.println("error was cached! values haven't changed ");
//        }

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();

        for (Player player : players) {
            System.out.println(player);
        }

        main.createPiece();

        HashMap<String, Piece> pieceHashMap = main.createPiece();
        System.out.println(pieceHashMap);

        main.play(players, pieceHashMap);
    }


    public ArrayList<Player> createPlayers() {
        ArrayList<Player> players = new ArrayList<>();

        Player whitePlayer = new Player("Beth", "beth@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasiliy", "vasiliy@gmail.com", false, 2500, 45);

        players.add(whitePlayer);
        players.add(blackPlayer);

        return players;
    }

    public HashMap<String, Piece> createPiece() {
        King whiteKing = new King(new Spot("H", 7), "white_king", true);
        System.out.println(whiteKing);
        King blackKing = new King(new Spot("D", 8), "black_king", false);
        System.out.println(blackKing);
        Rook whiteRookOne = new Rook(new Spot("G", 7), "white_rook_1", true);
        Rook whiteRookTwo = new Rook(new Spot("A", 7), "white_rook_2", true);
        Knight blackKnight = new Knight(new Spot("D", 6), "black_knight", false);
        System.out.println(whiteRookOne);
        System.out.println(whiteRookTwo);
        System.out.println(blackKnight);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getID(), whiteKing);
        pieceHashMap.put(blackKing.getID(), blackKing);
        pieceHashMap.put(whiteRookOne.getID(), whiteRookOne);
        pieceHashMap.put(whiteRookTwo.getID(), whiteRookTwo);
        pieceHashMap.put(blackKnight.getID(), blackKnight);

        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap) {
        try {
            players.get(0).movePiece(hashMap.get("white_rook_1"), new Spot("A", 8));
            players.get(1).movePiece(hashMap.get("black_knight"), new Spot("C", 8));

            //should fail
//            players.get(1).movePiece(hashMap.get("white_rook_1"), new Spot("A", 8));
//            players.get(0).movePiece(hashMap.get("white_rook_1"), new Spot("k", 8));
//            players.get(0).movePiece(hashMap.get("white_rook_1"), new Spot("A", 9));

        } catch (IllegalArgumentException err) {
            System.out.println("Incorrect move");
        }


    }
}