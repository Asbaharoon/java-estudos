package Collections.Set;

import java.util.*;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        //  rainbowMethod();
        favoriteLangMethod();
    }

    static void favoriteLangMethod() {
        // Ordem de inserção
        System.out.println("Inserção:");
        Set<FavoriteLang> favoriteLangs = new LinkedHashSet<>(){{
            add(new FavoriteLang("JavaScript", "VisualCode", 1995));
            add(new FavoriteLang("Java", "IntelliJ", 1995));
            add(new FavoriteLang("Python", "IDLE", 1991));
        }};
        for ( FavoriteLang lang : favoriteLangs ) System.out.printf("Name: %s --- IDE: %s --- First Appeared: %d.%n", lang.getName(), lang.getIde(), lang.getCreationYear());

        System.out.println(" ");
        // Ordem Natural (nome)
        System.out.println("Nome:");
        Set<FavoriteLang> orderedName = new TreeSet<>(favoriteLangs);
        for ( FavoriteLang lang : orderedName ) System.out.printf("Name: %s --- IDE: %s --- First Appeared: %d.%n", lang.getName(), lang.getIde(), lang.getCreationYear());

        System.out.println(" ");
        // Ordem IDE
        System.out.println("IDE:");
        Set<FavoriteLang> orderedIDE = new TreeSet<>(new ComparatorIDE());
        orderedIDE.addAll(favoriteLangs);
        for ( FavoriteLang lang : orderedIDE ) System.out.printf("Name: %s --- IDE: %s --- First Appeared: %d.%n", lang.getName(), lang.getIde(), lang.getCreationYear());

        System.out.println(" ");
        // Ordem Ano/Nome
        System.out.println("Nome/Ano:");
        Set<FavoriteLang> orderedNameYear = new TreeSet<>(new ComparatorNameYear());
        orderedNameYear.addAll(favoriteLangs);
        for ( FavoriteLang lang : orderedNameYear ) System.out.printf("Name: %s --- IDE: %s --- First Appeared: %d.%n", lang.getName(), lang.getIde(), lang.getCreationYear());

        System.out.println(" ");
        // Ordem Nome/Ano/IDE
        System.out.println("Nome/Ano/IDE");
        Set<FavoriteLang> orderedNameYearIDE = new TreeSet<>(new ComparatorNameYearIDE());
        orderedNameYearIDE.addAll(favoriteLangs);
        for ( FavoriteLang lang : orderedNameYearIDE ) System.out.printf("Name: %s --- IDE: %s --- First Appeared: %d.%n", lang.getName(), lang.getIde(), lang.getCreationYear());

        System.out.println(" ");
    }

    static class ComparatorIDE implements Comparator<FavoriteLang> {
        @Override
        public int compare(FavoriteLang f1, FavoriteLang f2) {
            return f1.getIde().compareTo(f2.getIde());
        }
    }

    static class ComparatorNameYear implements Comparator<FavoriteLang> {
        @Override
        public int compare(FavoriteLang f1, FavoriteLang f2) {
            int name = f1.getName().compareTo(f2.getName());
            if (name != 0) return name;
            return Integer.compare(f1.getCreationYear(), f2.getCreationYear());
        }
    }

    static class ComparatorNameYearIDE implements Comparator<FavoriteLang> {
        @Override
        public int compare(FavoriteLang f1, FavoriteLang f2) {
            int name = f1.getName().compareTo(f2.getName());
            if (name != 0) return name;
            int year = Integer.compare(f1.getCreationYear(), f2.getCreationYear());
            if (year != 0) return year;
            return f1.getIde().compareTo(f2.getIde());
        }
    }

    static void rainbowMethod() {
        // Crie conjunto com as cores do arco-íris
        Set<String> rainbow = new HashSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Cyan");
            add("Blue");
            add("Purple");
        }};

        // Exiba as cores uma abaixo da outra
        for ( String color : rainbow ) System.out.println(color);
        System.out.println(" ");

        // Exibir em ordem alfabética
        Set<String> alphabeticRainbow = new TreeSet<>(rainbow);
        for ( String color : alphabeticRainbow ) System.out.println(color);
        System.out.println(" ");

        // Exiba todas as cores que começam com a letra "R"
        // Remova todas as cores que começam com a letra "R"
        Iterator<String> iterator = rainbow.iterator();

        while(iterator.hasNext()) {
            String next = iterator.next();
            if (next.toLowerCase().contains("R".toLowerCase())) {
                System.out.println(next);
                iterator.remove();
            }
        }
        System.out.println(" ");
        System.out.println(rainbow);
        System.out.println(" ");

        // Limpe o conjunto
        rainbow.clear();
        alphabeticRainbow.clear();

        // Verifique se o conjunto está vazio
        System.out.println(rainbow.isEmpty());
        System.out.println(alphabeticRainbow.isEmpty());
    }
}