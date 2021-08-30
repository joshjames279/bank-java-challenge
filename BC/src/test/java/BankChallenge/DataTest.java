package BankChallenge;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    public void when100deposited(){
        Object[][] transactions = new Object[][]{{"deposit","10/01/2012",100}};
        Data data = new Data(transactions);
        String[] deposit1 = new String[]{"10/01/2012","100.00"};

        assertEquals(Arrays.asList(deposit1), data.storage());
    }

    @Test
    public void when100deposited60withdrawn(){
        Object[][] transactions = new Object[][]{{"deposit","10/01/2012",100},{"withdrawal","11/01/2012",60}};
        Data data = new Data(transactions);
        String[] deposit1 = new String[]{"10/01/2012","100.00"};
        String[] withdrawal1 = new String[]{"11/01/2012","60.00"};

        assertEquals(Arrays.asList(deposit1, withdrawal1), data.storage());
    }

}