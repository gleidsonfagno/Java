package ArrayECollection;

import java.util.*;

public class Collection {
//    Classe List: Vector, ArrayList, LinkedList
public static void main(String[] args) {


    List languages = new ArrayList();
    languages.add("Java");
    languages.add("Python");
    languages.add("C#");
    languages.add("C++");
    languages.add("PHP");
    languages.add("C#");
    languages.add("PHP");
    languages.add("JavaScript");

    System.out.println("Comprimeto atual:" + languages.size());
    System.out.println("O elemento na posição 3 : " + languages.get(3));
    System.out.println("A linguagem Java está na posição: " + languages.indexOf("Java"));
    languages.remove("PHP");
    System.out.println("Comprimeto atual:" + languages.size());
    languages.add(3, "TypeScript");
    System.out.println("Contem na Lista Go na lista: " + languages.contains("GO"));

//    for (int i = 0; i < languages.size(); i++) {
//        System.out.println(languages.get(i));
//    }

    for (Object language : languages) {
        System.out.println(language);
    }

    System.out.println("\n");
//    Conjuntos HashSet
    Set fruits = new HashSet();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Pear");
    fruits.add("Orange");
    fruits.add("Watermelon");
    fruits.add("Apple");

    for (Object fruit: fruits) {
        System.out.println(fruit);
    }
    System.out.println("\n");
//   LinkedHashSete() nao muda a ordenação
    Set books = new LinkedHashSet();
    books.add("Apple");
    books.add("Banana");
    books.add("Pear");
    books.add("Orange");
    books.add("Watermelon");
    books.add("Apple");

    for (Object book: books) {
        System.out.println(book);
    }
    System.out.println("\n");
//  TreeSeet(): ordem alfabetica
    Set boards = new TreeSet();
    boards.add("Apple");
    boards.add("Banana");
    boards.add("Pear");
    boards.add("Orange");
    boards.add("Watermelon");
    boards.add("Apple");

    for (Object board: boards) {
        System.out.println(board);
    }
}
}
