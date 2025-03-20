package designpatterns.StateDesignPattern;

public class StateDesignPatternMain {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.showMachineState();

        initializeInventory(machine);
        displayAvailableProducts(machine);
        machine.machineState = new IdleState();
        machine.machineState.clickOnInsertCoinButton(machine);
        machine.machineState.inserCoins(machine, Coin.ONE);
        machine.machineState.inserCoins(machine, Coin.TEN);
        machine.machineState = new SelectProductState();

        machine.showMachineState();
        machine.showCurrentTxnMoney();
        machine.showMachineState();
        machine.machineState.selectProduct(machine, new Product(101, "A", 10));
        machine.showMachineState();
    }

    private static void initializeInventory(VendingMachine machine) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product(101, "A", 10));
        inventory.addProduct(new Product(102, "B", 5));
        inventory.addProduct(new Product(103, "C", 7));
        inventory.addProduct(new Product(101, "A", 10));
        machine.setInventory(inventory);
    }

    private static void displayAvailableProducts(VendingMachine machine) {
        Inventory inventory = machine.inventory;

        for (String product : inventory.availableProducts.keySet()) {
            System.out.println(product + " : " + inventory.availableProducts.get(product));
        }
    }
}
