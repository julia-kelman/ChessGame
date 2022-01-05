//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SpotTest {

    @Test
    public void validSpotTest(){
        Spot newSpot= new Spot("A", 1);
        Assertions.assertNotNull(newSpot);
        Assertions.assertEquals(1, newSpot.getY());
        //should fail:
        //Assertions.assertEquals(2, newSpot.getY());
    }

    @ParameterizedTest
    @ValueSource (ints={-1, 0, 100})
    public void invalidParamsTest(int y){
        Spot newSpot= new Spot("A", y);
        Assertions.assertNotNull(newSpot);
        Assertions.assertEquals(1, newSpot.getY());

    }

}
