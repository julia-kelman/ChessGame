import java.util.ArrayList;

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

        ChessMain main=new ChessMain();
        ArrayList<Player> players= main.createPlayers();

        for (Player player: players){
            System.out.println(player);
        }

    }

    public ArrayList<Player> createPlayers(){
        ArrayList<Player> players= new ArrayList<>();

        Player whitePlayer= new Player("Beth", "beth@gmail.com", true, 2000, 20);
        Player blackPlayer= new Player("Vasiliy", "vasiliy@gmail.com", false, 2500, 45);

        players.add(whitePlayer);
        players.add(blackPlayer);

        return players;
    }
}
