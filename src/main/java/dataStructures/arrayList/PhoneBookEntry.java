package dataStructures.arrayList;

import java.util.ArrayList;

/**
 * @author Tedane Blake
 * @version 1.0
 * @since 2023-09-19
 *
 *   This class represents a phone book entry.
 */
public class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBookEntry() {
        this.name = "";
        this.phoneNumber = "";
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public String toString() {
        return "Name: " + this.name + " Phone Number: " + this.phoneNumber;
    }

    public static void main(String[] args) {
       // generate n PhoneBookEntry objects
        ArrayList<PhoneBookEntry> phoneBookEntries = new ArrayList<>();
        phoneBookEntries.add(new PhoneBookEntry("John", "1234567890"));
        phoneBookEntries.add(new PhoneBookEntry("Jane", "0987654321"));
        phoneBookEntries.add(new PhoneBookEntry("Jack", "1234567890"));
        phoneBookEntries.add(new PhoneBookEntry("Jill", "0987654321"));
        phoneBookEntries.add(new PhoneBookEntry("James", "1234567890"));

        // print out the phone book entries
        for (PhoneBookEntry phoneBookEntry : phoneBookEntries) {
            System.out.println(phoneBookEntry);
        }

    }

}
