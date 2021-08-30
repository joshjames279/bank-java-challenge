package BankChallenge;

public class Bank {
    private Object[][] array;
    private int startingBalance;

    public Bank(Object[][] array, int startingBalance){
        this.array = array;
        this.startingBalance = startingBalance;
    }

    public Bank(Object[][] array){
        this.array= array;
        this.startingBalance = 0;
    }

    public String statement(){
        return "Some string";
    };
}
