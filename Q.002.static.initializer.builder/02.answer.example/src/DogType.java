enum DogType {
 
    AKITA(1, "Akita dog"),
    BULLDOG(2, "Bulldog"),
    CHIWAWA(3, "Chiwawa"),
    CHOWCHOW(4, "Chow Chow"),
    POMERANIAN(5, "Pomeranian"),
    POODLE(6, "Poodle");

    public final int id;
    public final String type;

    private DogType(int id, String type) {
        this.id = id;
        this.type = type;
    }
}