package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        List<Books> list = new ArrayList<>();

        Books book = new Books("Роберт Мартин");
        Books book1 = new Books("Брюс Екел");
        Books book2 = new Books("Герберт Шилдт т.1");
        Books book3 = new Books("Герберт Шилдт т.2");
        Books book4 = new Books("Джошуа Блох");

        // Добавляю в коллекцию элементы.
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);

        // Изменяют элемент в коллекции.
        list.set(2, book4);

        // Получаю элементы коллекции.
        Books bookOneFromCollection = list.get(0);
        Books bookTwoFromCollection = list.get(1);
        Books bookThreeFromCollection = list.get(2);
        Books bookFourFromCollection = list.get(3);
        Books bookFiveFromCollection = list.get(4);

        System.out.println(bookOneFromCollection);
        System.out.println(bookTwoFromCollection);
        System.out.println(bookThreeFromCollection);
        System.out.println(bookFourFromCollection);
        System.out.println(bookFiveFromCollection);

        // Получаю размер коллекции.
        System.out.println(list.size());

        // Удаляю элементы из коллекции.
        boolean remove = list.remove(book3);
        System.out.println(remove);
    }
}
