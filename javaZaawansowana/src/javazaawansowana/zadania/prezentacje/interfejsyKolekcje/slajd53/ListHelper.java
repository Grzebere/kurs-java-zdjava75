package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd53;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {

    public static <E> void showDuplicates(List<E> list) {
        List<E> listOfDuplicates = new ArrayList<>();

        /*  ta petla jest identyczna jak petla ponizej
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i)) && !listOfDuplicates.contains(list.get(i))) {
                listOfDuplicates.add(list.get(i));
            }
        }
        */

        for (E element : list) {
            if (list.indexOf(element) != list.lastIndexOf(element) && !listOfDuplicates.contains(element)) {
                listOfDuplicates.add(element);
            }
        }
        System.out.println(listOfDuplicates);


    }

    public static <E> void removeDuplicates(List<E> listWithDuplicates) {

        for (int i = 0; i < listWithDuplicates.size(); i++) {
            if (listWithDuplicates.indexOf(listWithDuplicates.get(i)) != listWithDuplicates.lastIndexOf(listWithDuplicates.get(i)))  {
                listWithDuplicates.remove(listWithDuplicates.lastIndexOf(listWithDuplicates.get(i)));
            }
        }
        /* ta petla robilaby to samo, gdyby nie problem z jednoczesnym przegldaniem i usuwaniem elementow z Listy
        for (E element : listWithDuplicates) {
            if (listWithDuplicates.indexOf(element) != listWithDuplicates.lastIndexOf(element)) {
                listWithDuplicates.remove(listWithDuplicates.lastIndexOf(element));
            }
        }
         */

    }
}
