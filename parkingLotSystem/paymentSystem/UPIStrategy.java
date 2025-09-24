package parkingLotSystem.paymentSystem;

public class UPIStrategy implements PaymentStrategy{

    @Override
    public void collectPayment() {
        System.out.println("Payment vai UPI");
    }
}
