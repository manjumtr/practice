package designpatterns.StateDesignPattern;

public class ReturnChangeState implements VendingMachineState {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void inserCoins(VendingMachine machine, Coin coin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserCoins'");
    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, String product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    public void refund(Integer money) {
    }

}
