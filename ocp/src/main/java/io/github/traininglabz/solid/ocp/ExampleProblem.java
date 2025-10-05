package io.github.traininglabz.solid.ocp;

import lombok.RequiredArgsConstructor;

class ExampleProblem {

    @RequiredArgsConstructor
    static class PaymentManagement {

        public final PaymentMethod paymentMethod;

        public void pay(Money money) {
            switch (paymentMethod) {
                case CASH -> System.out.println("Paid with cash: " + money);
                case CARD -> System.out.println("Paid with card: " + money);
            }
        }
    }

    public static void run(PaymentMethod paymentMethod) {
        new PaymentManagement(paymentMethod).pay(new Money(100));
    }
}
