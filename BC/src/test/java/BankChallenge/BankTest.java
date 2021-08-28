package BankChallenge;

import BankChallenge.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {

    @Test
    public void when100IsDeposited(){
    Bank account = new Bank([["deposit", "10/01/2012",100]], 0);

    assertEquals("date || credit || debit || balance\n10/01/2012 || 100.00 || || 100.00\n", account.statement);
    }

    @Test
    public void when1000Deposited500Withdrawn (){
    Bank account = new Bank([["deposit", "10/01/2012",1000],["withdrawal", "14/01/2012",50]]);

    assertEquals("date || credit || debit || balance\n14/01/2012 || || 50.00 || 950.00\n10/01/2012 || 1000.00 || || 1000.00\n", account.statement);
    }

    @Test
    public void acceptanceCriteria(){
    Bank account = new Bank([["deposit", "10/01/2012",1000],["deposit", "13/01/2012",2000],["withdrawal", "14/01/2012",500]]);

    assertEquals("date || credit || debit || balance\n14/01/2012 || || 500.00 || 2500.00\n13/01/2012 || 2000.00 || || 3000.00\n10/01/2012 || 1000.00 || || 1000.00\n", account.statement)
    }

    @Test
    public void when2000Deposited1000Withdrawn100Deposited10_12WithdrawnWithStartingBalanceOf100 (){
        Bank account = new Bank([["deposit", "10/01/2012",2000],["withdrawal", "11/01/2012",1000],["deposit", "12/01/2012",100],["withdrawal", "13/01/2012",10.12]],100);

        assertEquals("date || credit || debit || balance\n13/01/2012 || || 10.12 || 1189.88\n12/01/2012 || 100.00 || || 1200.00\n11/01/2012 || || 1000.00 || 1100.00\n10/01/2012 || 2000.00 || || 2100.00\n", account.statement);
    }
}