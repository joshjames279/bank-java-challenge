package BankChallenge;

import java.util.List;
import java.util.stream.DoubleStream;

public class Bank {
    private Object[][] array;
    private Double balance;
    private String bankStatement;
    private List<String> balanceArray;
    private List<Object[]> dataArray;

    public Bank(Object[][] array, Double startingBalance){
        this.array = array;
        this.balance = startingBalance;
        this.bankStatement = "date || credit || debit || balance\n";

        Transaction transactions = new Transaction(this.array,this.balance);
        Data data = new Data(this.array);
        this.balanceArray = transactions.update();
        this.dataArray = data.storage();
    }

    public Bank(Object[][] array){
        this.array= array;
        this.bankStatement = "date || credit || debit || balance\n";

        Transaction transactions = new Transaction(this.array);
        Data data = new Data(this.array);
        this.balanceArray = transactions.update();
        this.dataArray = data.storage();
    }

    public String statement(){
        for (Integer i = this.array.length -1; i >= 0; i--) {
            if(this.array[i][0].equals("deposit") || this.array[i][0].equals("Deposit")) {
                System.out.println(this.dataArray);
                this.bankStatement += this.dataArray.get(i)[0].toString() + " || " + this.dataArray.get(i)[1].toString() +" || || " + this.balanceArray.get(i) + "\n";
            }
            else if(this.array[i][0].equals("withdrawal") || this.array[i][0].equals("Withdrawal")){
                this.bankStatement += this.dataArray.get(i)[0].toString() + " || || " + this.dataArray.get(i)[1].toString() + " || " + this.balanceArray.get(i) +"\n";
            }
        }
        return this.bankStatement;
    };
}
