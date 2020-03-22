package rocks.zipcode.quiz4.objectorientation.account;

import sun.jvm.hotspot.jdi.DoubleValueImpl;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    private BankAccount myAcc;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;
    private Double balance;
    private Double accBalance;

    public Employee() {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 0.0;
        this.accBalance = 0.0;

    }


    public Employee(BankAccount bankAccount) {
        this.myAcc = bankAccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 15.0;

    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.myAcc = bankAccount;
    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.balance += amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.balance -= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked = numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public BankAccount getBankAccount() {
        return myAcc;
    }
}
