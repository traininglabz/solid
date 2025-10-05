package io.github.traininglabz.solid.isp;

class ExampleSolution {

    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    interface Fax {
        void fax();
    }

    static class VintagePrinter implements Printer {
        @Override
        public void print() {
            System.out.println(this.getClass().getSimpleName() + ": Printing complete!");
        }
    }

    static class MultiFunctionPrinter implements Printer, Scanner, Fax {
        @Override
        public void print() {
            System.out.println(this.getClass().getSimpleName() + ": Printing complete!");
        }

        @Override
        public void scan() {
            System.out.println(this.getClass().getSimpleName() + ": Scanning complete!");
        }

        @Override
        public void fax() {
            System.out.println(this.getClass().getSimpleName() + ": Faxing complete!");
        }
    }

    public static void run() {

        Printer vintagePrinter = new VintagePrinter();
        print(vintagePrinter);

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        print(multiFunctionPrinter);
        multiFunctionPrinter.scan();
        multiFunctionPrinter.fax();

    }

    private static void print(Printer printer) {
        printer.print();
    }


}
