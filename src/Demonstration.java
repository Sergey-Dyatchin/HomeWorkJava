/**
 * A class to demonstrate how the program works
 */
public class Demonstration {
    /**
     * The method performs test actions with the phone book
     */
    public static void demonstrate() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "8-999-777-1111");
        phoneBook.add("Vasya", "8-999-777-2222");
        phoneBook.add("Vasya", "8-999-777-3333");
        phoneBook.add("Vasya", "8-000-000-0000");
        phoneBook.removeLastPhone("Vasya");
        phoneBook.add("Anya", "8-999-777-4444");
        phoneBook.add("Anya", "8-999-777-5555");
        phoneBook.add("Petya", "8-999-777-6666");
        phoneBook.add("Petya", "8-999-777-7777");
        phoneBook.add("Gosha", "8-999-777-8888");
        phoneBook.add("Gosha1", "8-999-777-9999");
        phoneBook.removeName("Gosha1");
        phoneBook.printOut();
    }
}
