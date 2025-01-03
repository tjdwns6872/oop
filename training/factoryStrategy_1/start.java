package training.factoryStrategy_1;

public class start {
    public static void main(String[] args) {
        PaymentFactory cardFactory = PaymentFactoryProvider.getFactory(TypeEnum.CREDIT_CARD);
        PaymentStrategy cardPayment = cardFactory.createPaymentStrategy();
        cardPayment.pay(0.5); // 출력: 카드 번호 유효성 검사 후 결제

        PaymentFactory paypalFactory = PaymentFactoryProvider.getFactory(TypeEnum.PAYPAL);
        PaymentStrategy paypalPayment = paypalFactory.createPaymentStrategy();
        paypalPayment.pay(1.5); // 출력: 계정 이메일을 확인 후 결제

        PaymentFactory bankFactory = PaymentFactoryProvider.getFactory(TypeEnum.BANK_TRANSFER);
        PaymentStrategy bankPayment = bankFactory.createPaymentStrategy();
        bankPayment.pay(2.5); // 출력: 계좌 정보를 확인 후 결제
    }
}
