package step2.view;

class ByePrintable extends Printable {
    private ByePrintable() {
        append("Bye~");
    }

    static ByePrintable getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final ByePrintable instance = new ByePrintable();
    }
}
