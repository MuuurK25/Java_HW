// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
package ДЗ5;


import java.util.HashMap;
import java.util.List;

public class task1 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Сидоров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(111)1821-11-11", "+7(555)555-55-55"));
        phoneBook.put("Кузнецов", List.of("+7(993)333-33-33", "+7(334)767-44-44"));
        phoneBook.put("Сидоров",List.of("+7(561)121-66-11", "+7(666)526-66-66"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}