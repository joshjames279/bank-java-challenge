package BankChallenge;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private Object[][] array;
    private Double balance = 0.00;
    private List<String> balanceArray= new ArrayList<String>();

    public Transaction (Object[][] array){
        this.array = array;
    }

    public Transaction (Object[][] array, Double balance){
        this.array = array;
        this.balance = balance;
    }

    public List<String> update(){
        DecimalFormat twoDP = new DecimalFormat("#.00");

        for (Integer i = 0; i < this.array.length; i++) {
            if(this.array[i][0].equals("deposit") || this.array[i][0].equals("Deposit")){ this.balance += (Double) this.array[i][2]; }
            else if(this.array[i][0].equals("withdrawal") || this.array[i][0].equals("Withdrawal")){ this.balance -= (Double) this.array[i][2]; }
            this.balanceArray.add(twoDP.format(this.balance));
        }
        return this.balanceArray;
    }



}
