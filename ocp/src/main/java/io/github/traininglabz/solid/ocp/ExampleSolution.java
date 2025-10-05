package io.github.traininglabz.solid.ocp;

class ExampleSolution {

    interface Payment {
        public void pay(Money money);
    }

    static class CardPayment implements Payment {
        @Override
        public void pay(Money money) {
            System.out.println("Paid with card: " + money);
        }
    }

    static class CashPayment implements Payment {
        @Override
        public void pay(Money money) {
            System.out.println("Paid with cash: " + money);
        }
    }

    public static void run(PaymentMethod paymentMethod) {
        Payment payment = switch (paymentMethod) {
            case CARD -> new CardPayment();
            case CASH -> new CashPayment();
        };
        payment.pay(new Money(100.0));
    }
}
