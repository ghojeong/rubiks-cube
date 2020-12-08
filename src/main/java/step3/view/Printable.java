package step3.view;

class Printable {
    static final String lineSeparator = System.lineSeparator();
    private final StringBuilder sb = new StringBuilder();

    void append(Object obj) {
        sb.append(obj);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
