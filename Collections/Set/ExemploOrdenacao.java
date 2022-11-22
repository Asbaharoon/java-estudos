package Collections.Set;

import java.util.*;

public class ExemploOrdenacao {
  public static void main(String[] args) {
    // Dada as seguintes informações sobre as séries, crie um conjunto e o ordene de acordo (nome - genero - tempo de episódio).
    // Série 1: GOT, fantasia, 60
    // Série 2: Dark, drama, 60
    // Série 3: That 70's show, comedia, 25

    // 1 - Ordem de Inserção
    System.out.println("1 - Ordem Aleatória");
    
    Set<Series> hashSeries = new HashSet<>(){{
      add(new Series("Got", "Fantasy", 60));
      add(new Series("Dark", "Drama", 60));
      add(new Series("That 70's Show", "Comedy", 25));
    }};
    for ( Series serie : hashSeries ) System.out.printf("Title: %s - Genre: %s - Duration: %d.%n", serie.getTitle(), serie.getGenre(), serie.getDuration());

    System.out.println(" ");
    // 2 - Ordem de Inserção
    System.out.println("2 - Ordem de Inserção");

    Set<Series> linkedHashSeries = new LinkedHashSet<>(){{
      add(new Series("Got", "Fantasy", 60));
      add(new Series("Dark", "Drama", 60));
      add(new Series("That 70's Show", "Comedy", 25));
    }};
    for ( Series serie : linkedHashSeries ) System.out.printf("Title: %s - Genre: %s - Duration: %d.%n", serie.getTitle(), serie.getGenre(), serie.getDuration());

    System.out.println(" ");
    // 3 - Ordem Natural (Tempo Eísódio)
    System.out.println("3 - Ordem Natural (nome)");

    Set<Series> treeSeries = new TreeSet<>(linkedHashSeries);
    for ( Series serie : treeSeries ) System.out.printf("Title: %s - Genre: %s - Duration: %d.%n", serie.getTitle(), serie.getGenre(), serie.getDuration());

    System.out.println(" ");

    // 4 - Ordem Nome/Cor/Idade
    System.out.println("4 - Ordem Nome/Gênero/Duração");

    Set<Series> treeSeries2 = new TreeSet<>(new ComparatorTitleGenreDuration());
    treeSeries2.addAll(hashSeries);
    for ( Series serie : treeSeries2 ) System.out.printf("Title: %s - Genre: %s - Duration: %d.%n", serie.getTitle(), serie.getGenre(), serie.getDuration());

    System.out.println(" ");
  }

  static class ComparatorTitleGenreDuration implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {
      int title = s1.getTitle().compareTo(s1.getTitle());
      if (title != 0) return title;
      int genre = s1.getGenre().compareTo(s2.getGenre());
      if (genre != 0) return genre;
      return Integer.compare(s1.getDuration(), s2.getDuration());
    }
  }
}
