package designpatterns.StateDesignPattern;

public class AcceptMoneyState implements VendingMachineState {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        System.out.println("Clicked on insert coin button, now machine will start accepting money");
        machine.currentState = VendingMachineStateEnum.ACCEPTING_MONEY;
        machine.machineState = new AcceptMoneyState();
    }

    @Override
    public void inserCoins(VendingMachine machine, Coin coin) {
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
