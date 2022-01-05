import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class PlayerTest {

    private static ArrayList<Player> players;
    private static HashMap<String, Piece> pieceHashMap;

    @BeforeAll
    public static void setup(){
        ChessMain main=new ChessMain();
        players=main.createPlayers();
        pieceHashMap=main.createPiece();
    }

    @BeforeEach
    public  void beforeEachTest(){
        System.out.println("before each");
    }

    @AfterEach
    public  void afterEachTest(){
        System.out.println("after each");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("after each");
    }

    @Test
    public void validMoveTest(){
        players.get(0).movePiece(pieceHashMap.get("white_king"), new Spot("H", 8));
        Assertions.assertEquals(8, pieceHashMap.get("white_king").getSpot().getY());
    }

    @Test
    public void invalidPlayerTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            players.get(1).movePiece(pieceHashMap.get("white_king"), new Spot("H", 8));
        });
    }

//can make param tests
    @Test
    public void invalidMoveOnXTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            players.get(1).movePiece(pieceHashMap.get("white_king"), new Spot("I", 8));
        });
    }

//can make param tests
    @Test
    public void invalidMoveOnYTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            players.get(1).movePiece(pieceHashMap.get("white_king"), new Spot("H", 0));
        });
    }


    @Test
    public void playerCreateTest(){
        Player whitePlayer = new Player("Beth", "beth@gmail.com", true, 2000, 20);
        Assertions.assertEquals("Beth", whitePlayer.getName());
        Assertions.assertEquals("beth@gmail.com", whitePlayer.getEmail());
        Assertions.assertTrue(whitePlayer.isWhite());
        Assertions.assertEquals(2000, whitePlayer.getRank());
        Assertions.assertEquals(20, whitePlayer.getAge());
    }

    @ParameterizedTest
    @MethodSource ("nameError")
    public void playerNotCreatedTest(String name){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Player(name, "beth@gmail.com", true, 2000, 20);
        });
    }

    static Stream<String> nameError(){
        return Stream.of("", "  ", null);
    }

//    @ParameterizedTest
//    @MethodSource ("nameError")
//    public void playerCreationIncorrectNameTest(String name){
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            Player whitePlayer = new Player(name, "beth.harmon@gmail.com", true, 2000, 20);
//
//        });
//    }



//    static Stream<String> nameError(){
//        return Stream.of("", "   ", null);
//    }




}
