import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Class phone book
 */
public class PhoneBook {

    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    /**
     * Аdds a new entry to the phone book.
     * If the name exists, adds a new number.
     * @param name
     * @param phoneNum
     */
    public void add(String name, String phoneNum) {
        if (phoneBook.containsKey(name))
            phoneBook.get(name).add(phoneNum);
        else {
            ArrayList<String> phoneList = new ArrayList<>();
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }
    }

    /**
     * Deletes an entry by name with all phones.
     * @param name
     */
    public void removeName(String name) {
        phoneBook.remove(name);
    }

    /**
     * Deletes the last recorded phone number.
     * @param name
     */
    public void removeLastPhone(String name) {
        if (phoneBook.containsKey(name) && (phoneBook.get(name).size() - 1) >= 0)
            phoneBook.get(name).remove(phoneBook.get(name).size() - 1);
    }

    /**
     * Prints the phone book in descending order of the number of phone numbers
     */
    public void printOut() {
        ArrayList<Entry> printPhoneBook = new ArrayList<>();
        for (String name : phoneBook.keySet())
            printPhoneBook.add(new Entry(name, phoneBook.get(name)));
        Collections.sort(printPhoneBook);
        System.out.println(printPhoneBook);
    }
}