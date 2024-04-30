import java.util.ArrayList;

/**
 * The Entry class for sorting records and printing.
 */
public class Entry implements Comparable<Entry> {
    private String name;
    private ArrayList<String> phones;

    /**
     * Class constructor
     * @param name
     * @param phones
     */
    public Entry(String name, ArrayList<String> phones) {
        this.name = name;
        this.phones = phones;
    }

    @Override
    public String toString() {
        return '{' + name + " = " + phones + '}';
    }

    @Override
    public int compareTo(Entry o) {
        return o.phones.size() - this.phones.size();
    }
}
