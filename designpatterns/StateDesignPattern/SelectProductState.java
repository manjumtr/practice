package designpatterns.StateDesignPattern;

import java.util.Map;

public class SelectProductState implements VendingMachineState {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {

    }

    @Override
    public void inserCoins(VendingMachine machine, Coin coin) {

    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {
        System.out.println("Selected product : " + product.name);
        if (canDispense(machine, product)) {
            machine.machineState = new DispenseProductState();
            machine.machineState.dispenseProduct(machine, product.name);
        } else {
            System.out.println("Product not available");
            machine.machineState = new RefundState();
            machine.machineState.refund(machine.txnMoney);
        }

    }

    @Override
    public void dispenseProduct(VendingMachine machine, String name) {
    }

    private boolean canDispense(VendingMachine machine, Product product) {
        Map<String, Integer> availableProducts = machine.inventory.availableProducts;
        boolean canDispense = false;
        if (availableProducts.containsKey(product.name) && machine.inventory.isAvailable(product)
                && machine.txnMoney > product.price) {
            canDispense = true;
        }
        return canDispense;
    }

    public void refund(Integer money) {
        System.out.println("Money refunded successfully..." + money);
    }
}
