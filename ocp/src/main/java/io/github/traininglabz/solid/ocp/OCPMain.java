package io.github.traininglabz.solid.ocp;

public class OCPMain {
    public static void main(String[] args) {
        System.out.println("OCP: Open-Closed Principle\n" + "+".repeat(50));

        PaymentMethod paymentMethod = args.length > 1 ? PaymentMethod.valueOf(args[1]) : PaymentMethod.CASH;
        if (args.length == 0 || !args[0].equalsIgnoreCase("solution")) {
            System.out.println("Executing example problem...");
            ExampleProblem.run(paymentMethod);
        } else {
            System.out.println("Executing example solution...");
            ExampleSolution.run(paymentMethod);
        }
        System.out.println();
    }
}