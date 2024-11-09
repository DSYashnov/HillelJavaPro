package hw_09.phonebook;

import java.util.ArrayList;

public class TelephoneDirectory {
    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.add("Stanislav", "+380634939107");
        directory.add("Olena", "+380504568321");

        Record record = new Record("Ivan", "+380648787518");
        directory.add(record);

        System.out.println("TelephoneDirectory");
        directory.printDirectory();

        System.out.println("\nSearch Result:");
        Record result = directory.find("Olena");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Record not found");
        }
    }
    public void add (String name, String phone) {
        Record newRecord = new Record(name, phone);
        records.add(newRecord);
    }

    private ArrayList<Record> records;

    public TelephoneDirectory(){
        this.records = new ArrayList<>();
    }
    public void add (Record record) {
        records.add(record);
    }
    public void printDirectory () {
        for (Record record : records) {
            System.out.println(record);
        }
    }
    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record; // Повертаємо перший знайдений запис
            }
        }
        return null; // Якщо запис не знайдений
    }
}
