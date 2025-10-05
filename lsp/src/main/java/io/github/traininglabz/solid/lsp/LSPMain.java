package io.github.traininglabz.solid.lsp;

public class LSPMain {
    public static void main(String[] args) {
        System.out.println("LSP: Liskov Substitution Principle\n" + "+".repeat(50));

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