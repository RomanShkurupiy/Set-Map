import java.util.*;


public class Queue {
    public static void main(String[] args) {

        Map<String, Integer> browser = new HashMap<>();
        browser.put("String 1 -", 1);
        browser.put("String 2 -", 2);
        browser.put("String 3 -", 4);
        browser.put("String 4 -", 8);
        browser.put("String 5 -", 16);
        browser.put("String 6 -", 32);
        browser.put("String 7 -", 64);
        browser.put("String 8 -", 128);
        browser.put("String 9 -", 256);
        browser.put("String 10 -", 512);

        for (Map.Entry<String, Integer> mapping : browser.entrySet()) {
            System.out.println(mapping.getKey() + " " + mapping.getValue() );;
        }
        System.out.println();
    ArrayList<String> lang = new ArrayList<>();
    lang.add("Java");
    lang.add("Python");
    lang.add("Perl");
    lang.add("C++");
    lang.add("Java");
    lang.add("C++");
    lang.add("C#");

    Set<String> langUnique = new HashSet<>(lang);
        System.out.println("Array list with duplicates:");
        System.out.println(lang);
        System.out.println("Array list without duplicates:");
        System.out.println(langUnique);

        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(5);
        System.out.println();
        System.out.println(array.toString());

        System.out.println(counterCatch(4, array));

    }

    public static int counterCatch(int num, ArrayList<Integer> a) {
        int rep = 0;
        for (int i = 0; i < a.size(); i++) {
            int curr=a.get(i);
            if (curr == num) {
                rep++;
            }
        }
        return rep;
    }
}