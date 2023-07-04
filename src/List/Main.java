package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<String> myList = new ArrayList<>();

            // Заповнення списку
            myList.add("Елемент 1");
            myList.add("Елемент 2");
            myList.add("Елемент 3");
            myList.add("Елемент 4");
            myList.add("Елемент 5");
            myList.add("Елемент 6");
            myList.add("Елемент 7");
            myList.add("Елемент 8");
            myList.add("Елемент 9");
            myList.add("Елемент 10");

            // Виведення вмісту списку за допомогою ітератора
            Iterator<String> iterator = myList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }
        }
}

