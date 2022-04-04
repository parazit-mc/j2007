package hw2_3;
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив
//        (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.

//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с
//        помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
//        может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.*;
import java.util.Map.Entry;

class StringCounter{
    public static void processArray() {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("many");
        ls.add("random");
        ls.add("random");
        ls.add("words");
        ls.add("should");
        ls.add("be");
        ls.add("there");
        ls.add("there");
        System.out.println("arrayList " + ls.toString());

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String w : ls){
            System.out.println(w);
            if (!wordsCount.containsKey(w)){
                wordsCount.put(w,0);
            }

            wordsCount.put(w,wordsCount.get(w)+1);

        }

        System.out.println(wordsCount.keySet());
        System.out.println(wordsCount.values());
    }
}
class PhoneBook{
        public HashMap addEntries(){
            HashMap<String,String> pbook = new HashMap<>();
            pbook.put("+7 495 675 43 20","Иванов");
            pbook.put("+7 812 854 78 90", "Петров");
            pbook.put("+7 666 987 12 66", "Сидоров");
            pbook.put("+7 495 770 30 89", "Михайлов");
            pbook.put("+7 495 898 76 44", "Путин");
            pbook.put("+7 499 233 18 13", "Симонян");
            pbook.put("+375 029 111 11 11", "Лукашенко");
            pbook.put("+7 999 999 11 00", "Путин");

//            System.out.println(pbook.toString());
            return pbook;
         }

         public void retrievePhoneNumber(HashMap<String, String> pbook, String name){
            String phoneNumber = "";
            if (!pbook.containsValue(name)){
                System.out.println(name + " not found in phoneBook");
                return;
            }

             for (Entry<String, String> ent : pbook.entrySet()) {
                 if (Objects.equals(name, ent.getValue())) {
                     phoneNumber = phoneNumber + ent.getKey() + "; ";
                 }
             }

             System.out.println("Для абонента по фамилии " + name + " найдены телефон/телефоны " + phoneNumber);
         }
}


public class App {


    public static void main(String[] args) {

        StringCounter stringCounter = new StringCounter();
        stringCounter.processArray();

        PhoneBook phoneBook = new PhoneBook();
        HashMap<String,String> pbook = phoneBook.addEntries();

        phoneBook.retrievePhoneNumber(pbook, "Зеленский");
        phoneBook.retrievePhoneNumber(pbook, "Сидоров");
        phoneBook.retrievePhoneNumber(pbook, "Путин");







    }



}


