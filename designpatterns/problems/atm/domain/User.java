package problems.atm.domain;

public class User {
    private String name;
    private Card card;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public User(String name, Card card, BankAccount account) {
        this.name = name;
        this.card = card;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    private BankAccount account;
}
