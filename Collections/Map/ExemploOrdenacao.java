package Collections.Map;

import java.util.*;
import java.util.Map.Entry;

public class ExemploOrdenacao {
  // Dada as seguintes informações sobre livros e seus autores, crie um dicionário e ordene da maneira solicitada
  // Nome Autor - Nome Livro - Páginas
  // Hawking, Stephen - Uma Breve História do Tempo - 256
  // Duhigg, Charles - O Poder do Hábito - 408
  // Marari, Yuval Noah - 21 Lições para o Século 21 - 432
  public static void main(String[] args) {
    // 1 - Ordem aleatória
    System.out.println("1 - Ordem aleatória");

    Map<String, Book> books = new HashMap<>(){{
      put("Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
      put("Duhigg, Charles", new Book("O Poder do Hábito", 408));
      put("Marari, Yuval Noah", new Book("21 Lições para o Século 21", 432));
    }};
    for (Map.Entry<String, Book> book : books.entrySet()) {
      System.out.println(book.getKey() + " - " + book.getValue().getTitle());
    }

    System.out.println(" ");
    // 2 - Ordem inserção
    System.out.println("2 - Ordem inserção");

    Map<String, Book> booksInsertion = new LinkedHashMap<>(){{
      put("Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
      put("Duhigg, Charles", new Book("O Poder do Hábito", 408));
      put("Marari, Yuval Noah", new Book("21 Lições para o Século 21", 432));
    }};
    for (Map.Entry<String, Book> book : booksInsertion.entrySet()) {
      System.out.println(book.getKey() + " - " + book.getValue().getTitle());
    }

    System.out.println(" ");
    // 3 - Ordem alfabética autores
    System.out.println("3 - Ordem alfabética autores");

    Map<String, Book> booksAlphabetic = new TreeMap<>(books);
    for (Map.Entry<String, Book> book : booksAlphabetic.entrySet()) {
      System.out.println(book.getKey() + " - " + book.getValue().getTitle());
    }

    System.out.println(" ");
    // 4 - Ordem alfabética livros
    System.out.println("4 - Ordem alfabética livros");

    Set<Map.Entry<String, Book>> booksAlphabeticTitle = new TreeSet<>(new ComparatorTitle());
    booksAlphabeticTitle.addAll(books.entrySet());
    for (Map.Entry<String, Book> book : booksAlphabeticTitle) {
      System.out.println(book.getKey() + " - " + book.getValue().getTitle());
    }

    System.out.println(" ");
    // 5 - Ordem número páginas
    System.out.println("5 - Ordem número páginas");

    Set<Map.Entry<String, Book>> booksPages = new TreeSet<>(new ComparatorPages());
    booksPages.addAll(books.entrySet());
    for (Map.Entry<String, Book> book : booksPages) {
      System.out.println(book.getKey() + " - " + book.getValue().getTitle());
    }

    System.out.println(" ");
  }

  static class Book {
    private String title;
    private Integer pages;
    
    public Book(String title, Integer pages) {
      this.title = title;
      this.pages = pages;
    }

    public String getTitle() {
      return title;
    }
    public Integer getPages() {
      return pages;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return title.equals(book.title) && pages.equals(book.pages);
    }

    @Override
    public int hashCode() {
      return Objects.hash(title, pages);
    }

    @Override
    public String toString() {
      return "{" +
              "title: " + title +
              "pages: " + pages +
              "}";
    }
  }

  static class ComparatorTitle implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
      return b1.getValue().getTitle().compareToIgnoreCase(b2.getValue().getTitle());
    }
  }

  static class ComparatorPages implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
      return b1.getValue().getPages().compareTo(b2.getValue().getPages());
    }
  }

}
