import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        // заполнение списка строками
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i+1) + ": ");
            String s = scanner.nextLine();
            list.add(s);
        }

        // поиск самого длинного слова
        String longestWord = "";
        for (String s : list) {
            String[] words = s.split(" "); // разбиваем строку на слова
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        // вывод результата
        System.out.println("Самое длинное слово: " + longestWord);
    }
}