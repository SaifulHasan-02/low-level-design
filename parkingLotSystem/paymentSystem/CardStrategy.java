package parkingLotSystem.paymentSystem;

public class CardStrategy implements PaymentStrategy{
    @Override
    public void collectPayment(Double amt) {
        System.out.println("Payment via a card");
    }
}
