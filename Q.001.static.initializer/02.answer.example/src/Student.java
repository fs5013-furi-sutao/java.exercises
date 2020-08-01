class Student {

    static {
        maxId = 0;
    }

    private static int maxId;
    private int id;
    private String name;

    public Student(final String name) {
        this.name = name;
        this.id = ++maxId;
    }

    public String info() {
        return String.format("Student.id=%d, Student.name=%s", this.id, this.name);
    }
}