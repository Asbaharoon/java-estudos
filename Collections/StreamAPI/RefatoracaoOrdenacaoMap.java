package Collections.StreamAPI;

import java.util.*;

public class RefatoracaoOrdenacaoMap {
  // Dada as seguintes informações de id e contato, crie um dicionário e ordene este dicionário exibindo: (Nome id - Nome contato);
  // id = 1 - Contato = nome: Simon, numero: 2222;
  // id = 2 - Contato = nome: Cami, numero: 5555;
  // id = 3 - Contato = nome: Jon, numero: 1111;

  public static void main(String[] args) {
    System.out.println("1 - Ordem aleatória");
    Map<Integer, Contact> contacts = new HashMap<>(){{
      put(1, new Contact("Simon", 5555));
      put(2, new Contact("Cami", 2222));
      put(3, new Contact("Jon", 7777));
    }};
    for (Map.Entry<Integer, Contact> contact : contacts.entrySet()) {
      System.out.println("id " + contact.getKey() + " - " + contact.getValue().getName() + " - " + contact.getValue().getNumber());
    }
    System.out.println(" ");

    System.out.println("2 - Ordem Ids");
    Map<Integer, Contact> orderedContacts = new TreeMap<>(contacts);
    for (Map.Entry<Integer, Contact> contact : orderedContacts.entrySet()) {
      System.out.println("id " + contact.getKey() + " - " + contact.getValue().getName() + " - " + contact.getValue().getNumber());
    }
    System.out.println(" ");

    System.out.println("3 - Ordem Número de Telefone");
    // Classe Anônima
    // Set<Map.Entry<Integer, Contact>> phoneOrderedContacts = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
    //   @Override
    //   public int compare(Map.Entry<Integer, Contact> c1, Map.Entry<Integer, Contact> c2) {
    //   return Integer.compare(c1.getValue().getNumber(), c2.getValue().getNumber());
    //   }
    // });

    // Com Functional Interface
    // Set<Map.Entry<Integer, Contact>> phoneOrderedContacts = new TreeSet<>(Comparator.comparing(
    //   new Function<Map.Entry<Integer, Contact>, Integer>() {
    //     @Override
    //     public Integer apply(Entry<Integer, Contact> cont) {
    //       return cont.getValue().getNumber();
    //     }
    // }));

    // Com Lambda
    Set<Map.Entry<Integer, Contact>> phoneOrderedContacts = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumber()));
    
    // Não é possível fazer com Reference Method!

    phoneOrderedContacts.addAll(contacts.entrySet());
    for (Map.Entry<Integer, Contact> contact : phoneOrderedContacts) {
      System.out.println("id " + contact.getKey() + " - " + contact.getValue().getName() + " - " + contact.getValue().getNumber());
    }
    System.out.println(" ");

    System.out.println("4 - Ordem Nome Contato");
    Set<Map.Entry<Integer, Contact>> nameOrderedContacts = new TreeSet<>(Comparator.comparing(contact -> contact.getValue().getName()));
    nameOrderedContacts.addAll(contacts.entrySet());
    for (Map.Entry<Integer, Contact> contact : nameOrderedContacts) {
      System.out.println("id " + contact.getKey() + " - " + contact.getValue().getName() + " - " + contact.getValue().getNumber());
    }
    System.out.println(" ");
  }

  static class Contact {
    private String name;
    private Integer number;
    
    public Contact(String name, Integer number) {
      this.name = name;
      this.number = number;
    }

    public String getName() {
      return name;
    }
    public Integer getNumber() {
      return number;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Contact contact = (Contact) o;
      return name.equals(contact.name) && number.equals(contact.number);
    }
  }
}
