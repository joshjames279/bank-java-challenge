package BankChallenge;

public class Bank {
    private Transaction[] array;
    private int startingBalance;

    public Bank(Transaction[] array, int startingBalance){
        this.array = array;
        this.startingBalance = startingBalance;
    }

    public String statement(){
        return "Some string";
    };
}
