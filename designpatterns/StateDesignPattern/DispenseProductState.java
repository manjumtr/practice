package designpatterns.StateDesignPattern;

public class DispenseProductState implements VendingMachineState {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {

    }

    @Override
    public void inserCoins(VendingMachine machine, Coin coin) {
    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, String product) {
        Integer txnMoney = machine.txnMoney;
        Integer price = 0;
        if (txnMoney > price) {
            machine.machineState = new RefundState();
            machine.machineState.refund(txnMoney - price);
        }

        Integer newCount = machine.inventory.availableProducts.get(product) - 1;
        machine.inventory.availableProducts.put(product, newCount);
        machine.machineState = new IdleState();
    }

    public void refund(Integer money) {
    }

}
