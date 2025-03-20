package designpatterns.StateDesignPattern;

public interface VendingMachineState {

    void clickOnInsertCoinButton(VendingMachine machine);

    void inserCoins(VendingMachine machine, Coin coin);

    void selectProduct(VendingMachine machine, Product product);

    void dispenseProduct(VendingMachine machine, String product);

    void refund(Integer money);

}
