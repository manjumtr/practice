package designpatterns.StateDesignPattern;

public class VendingMachine {
    public VendingMachineStateEnum currentState;
    public VendingMachineState machineState;
    public Inventory inventory;
    public Integer txnMoney;

    public VendingMachine() {
        this.currentState = VendingMachineStateEnum.IDLE;
        this.inventory = null;
        this.machineState = new IdleState();
        this.txnMoney = 0;
    }

    public VendingMachineStateEnum getCurrentState() {
        return this.currentState;
    }

    public void showCurrentTxnMoney() {
        System.out.println("Inserted " + this.txnMoney + " so far");
    }

    public void showMachineState() {
        System.out.println("Machine is in : " + this.currentState.name().toLowerCase() + " state");
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
