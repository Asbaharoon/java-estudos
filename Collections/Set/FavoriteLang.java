package Collections.Set;

public class FavoriteLang implements Comparable<FavoriteLang> {
    private String name;
    private String ide;
    private Integer creationYear;

    public FavoriteLang(String name, String ide, Integer creationYear) {
        this.name = name;
        this.ide = ide;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public String getIde() {
        return ide;
    }

    public Integer getCreationYear() {
        return creationYear;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", ide='" + ide + '\'' +
                ", creationYear=" + creationYear +
                '}';
    }

    @Override
    public int compareTo(FavoriteLang fav) {
        return this.getName().compareTo(fav.getName());
    }
}
