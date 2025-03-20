package designpatterns.StateDesignPattern;

public class InsertCoinState implements VendingMachineState {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void inserCoins(VendingMachine machine, Coin coin) {
        machine.txnMoney += coin.getValue();

    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, String product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    public void refund(Integer money) {
    }

}
