package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Loan {
    private long amount;

    public Loan(){}

    public Loan(long amount) {
        this.amount = amount;
    }

    boolean payLoanInstallment(long repayAmount){
            if (repayAmount <= 0){
                System.out.println("Invalid amount");

                return false;
            }

            if (this.amount == 0){
                System.out.println("Your loan is fully settled");
                return false;
            }

            if (repayAmount > amount ){
                System.out.println("You have change of "+ (repayAmount - amount));
                this.amount = 0;
                return true;
            }

            this.amount -= repayAmount;
            return true;
        }

    long getAmount(){
        return amount;
    }
}
