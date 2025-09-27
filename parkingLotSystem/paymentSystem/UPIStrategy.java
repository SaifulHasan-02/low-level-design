package parkingLotSystem.paymentSystem;

public class UPIStrategy implements PaymentStrategy{

    @Override
    public void collectPayment(Double amt) {
        System.out.println("Payment vai UPI");
    }
}
