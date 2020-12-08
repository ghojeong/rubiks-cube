package step3.view;

class AskInputPrintable extends Printable {
    private AskInputPrintable() {
        append(lineSeparator);
        append("CUBE> ");
    }

    static AskInputPrintable getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final AskInputPrintable instance = new AskInputPrintable();
    }
}
