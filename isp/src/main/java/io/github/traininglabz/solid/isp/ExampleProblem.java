package io.github.traininglabz.solid.isp;

class ExampleProblem {

    interface Printer {
        void print();

        void scan();

        void fax();
    }

    static class VintagePrinter implements Printer {
        @Override
        public void print() {
            System.out.println(this.getClass().getSimpleName() + ": Printing complete!");
        }

        @Override
        public void scan() {
            System.out.println(this.getClass().getSimpleName() + ": SCAN NOT SUPPORTED!");
        }

        @Override
        public void fax() {
            System.out.println(this.getClass().getSimpleName() + ": FAX NOT SUPPORTED!");
        }
    }

    static class MultiFunctionPrinter implements Printer {
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
        vintagePrinter.print();
        vintagePrinter.scan();
        vintagePrinter.fax();

        Printer multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print();
        multiFunctionPrinter.scan();
        multiFunctionPrinter.fax();

    }
}
