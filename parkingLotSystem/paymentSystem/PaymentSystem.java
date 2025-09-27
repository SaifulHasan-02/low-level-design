package parkingLotSystem.paymentSystem;

public class PaymentSystem {

    Double amt;
    PaymentStrategy paymentStrategy;
    PaymentSystem(Double amt, PaymentStrategy paymentStrategy){
        this.amt = amt;
        this.paymentStrategy = paymentStrategy;
    }

    public void payNow(){
        if(this.amt > 0){
            this.paymentStrategy.collectPayment(this.amt);
        }
        System.out.println("Invalid amount.");
    }
}
