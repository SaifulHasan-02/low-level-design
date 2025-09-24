package parkingLotSystem.paymentSystem;

public class Cash implements PaymentStrategy{
    @Override
    public void collectPayment() {
        System.out.println("Payment vai a cash");
    }
}
