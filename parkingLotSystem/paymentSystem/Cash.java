package parkingLotSystem.paymentSystem;

public class Cash implements PaymentStrategy{
    @Override
    public void collectPayment(Double amt) {
        System.out.println("Payment vai a cash");
    }
}
