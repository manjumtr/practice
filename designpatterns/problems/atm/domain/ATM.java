package problems.atm.domain;

import problems.atm.state.ATMState;

public class ATM {

    private double balance;
    private int numberOf2k;
    private int numberOf500;
    private int numberOf100;
    private ATMState state;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOf2k() {
        return numberOf2k;
    }

    public void setNumberOf2k(int numberOf2k) {
        this.numberOf2k = numberOf2k;
    }

    public int getNumberOf500() {
        return numberOf500;
    }

    public void setNumberOf500(int numberOf500) {
        this.numberOf500 = numberOf500;
    }

    public int getNumberOf100() {
        return numberOf100;
    }

    public ATMState getState() {
        return state;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void setNumberOf100(int numberOf100) {
        this.numberOf100 = numberOf100;
    }

    public ATM(double balance, int numberOf2k, int numberOf100, int numberOf500, ATMState state) {
        this.balance = balance;
        this.numberOf2k = numberOf2k;
        this.numberOf100 = numberOf100;
        this.numberOf500 = numberOf500;
        this.state = state;
    }
}
