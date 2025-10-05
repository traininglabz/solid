package io.github.traininglabz.solid.dip;

public class DIPMain {
    public static void main(String[] args) {
        System.out.println("DIP: Dependency Inversion Principle\n" + "+".repeat(50));

        if (args.length == 0 || !args[0].equalsIgnoreCase("solution")) {
            System.out.println("Executing example problem...");
            ExampleProblem.run();
        } else {
            System.out.println("Executing example solution...");
            ExampleSolution.run();
        }
        System.out.println();
    }
}