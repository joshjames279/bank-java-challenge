package BankChallenge;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private Object[][] array;
    private List<Object[]> dataArray= new ArrayList<Object[]>();

    public Data (Object[][] array){
        this.array = array;
    }

    public List<Object[]> storage(){
        DecimalFormat twoDP = new DecimalFormat("#.00");

        for (Integer i = 0; i < this.array.length; i++) {
            if (this.array[i][0].equals("deposit") || this.array[i][0].equals("Deposit") || this.array[i][0].equals("withdrawal") || this.array[i][0].equals("Withdrawal")) {
                String date = (String) this.array[i][1];
                Double amount = (Double) this.array[i][2];
                Object[] data = new Object[2];
                data[0] = date;
                data[1] = twoDP.format(amount);
                this.dataArray.add(data);
            }
        }
        return this.dataArray;
    }

}
