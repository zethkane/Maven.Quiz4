package rocks.zipcode.quiz4.objectorientation.account;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private ArrayList<BankAccount> accs = new ArrayList<>();


    public void removeBankAccountByIndex(Integer indexNumber) {
        for (int i = 0; i < accs.size() ; i++) {
            if (i == indexNumber){
                accs.remove(i);
            }
        }
    }

    public void addBankAccount(BankAccount bankAccount) {
        accs.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (accs.contains(bankAccount)) {
            return true;
        }
        else return false;
    }

}
