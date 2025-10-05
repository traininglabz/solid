package io.github.traininglabz.solid.isp;

public class ISPMain {
    public static void main(String[] args) {
        System.out.println("ISP: Interface Segregation Principle\n" + "+".repeat(50));

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