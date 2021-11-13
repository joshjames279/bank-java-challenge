package BankChallenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void when100deposited(){
        Object[][] transactions = new Object[][]{{"deposit","10/01/2012",100.00}};
        Transaction transaction = new Transaction(transactions);
        String[] sum1 = new String[]{"100.00"};

        assertEquals(Arrays.toString(sum1), transaction.update().toString());
    }

    @Test
    public void when100deposited60withdrawn(){
        Object[][] transactions = new Object[][]{{"deposit","10/01/2012",100.00},{"withdrawal","11/01/2012",60.00}};
        Transaction transaction = new Transaction(transactions);
        String sum1 = "100.00";
        String sum2 = "40.00";
        String[] balanceArray = new String[]{sum1,sum2};

        assertEquals(Arrays.toString(balanceArray), transaction.update().toString());
    }

    @Test
    public void when100deposited60withdrawn20withdrawn2000deposited(){
        Object[][] transactions = new Object[][]{{"deposit","10/01/2012",100.00},{"withdrawal","11/01/2012",60.00},{"withdrawal","12/01/2012",20.00},{"deposit","13/01/2012",2000.00}};
        Transaction transaction = new Transaction(transactions);
        String sum1 = "100.00";
        String sum2 = "40.00";
        String sum3 = "20.00";
        String sum4 = "2020.00";
        String[] balanceArray = new String[]{sum1,sum2, sum3, sum4};

        assertEquals(Arrays.toString(balanceArray), transaction.update().toString());
    }

    @Test
    public void when200deposited80withdrawn10withdrawn1000deposited(){
        Object[][] transactions = new Object[][]{{"deposit","10/01/2012",200.00},{"withdrawal","11/01/2012",80.00},{"withdrawal","12/01/2012",10.00},{"deposit","13/01/2012",1000.00}};
        Transaction transaction = new Transaction(transactions);
        String sum1 = "200.00";
        String sum2 = "120.00";
        String sum3 = "110.00";
        String sum4 = "1110.00";
        String[] balanceArray = new String[]{sum1,sum2, sum3, sum4};

        assertEquals(Arrays.toString(balanceArray), transaction.update().toString());
    }

}