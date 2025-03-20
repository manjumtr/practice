package problems.atm.domain;

public class Card {
    private String number;
    private String pin;
    private BankAccount account;

    public Card(String number, String pin, BankAccount account) {
        this.number = number;
        this.pin = pin;
        this.account = account;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}
