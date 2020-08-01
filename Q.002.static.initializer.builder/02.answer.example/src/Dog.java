class Dog {
    public int               id;
    public String            name;
    public DogType           type;

    private Dog() {}

    public static class Builder {

        static {
            maxId = 0;
        }

        private static int maxId;
        private int        id;
        private String     name;
        private DogType    type;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            this.id   = ++maxId;
            return this;
        }

        public Builder type(DogType type) {
            this.type = type;
            return this;
        }

        public Dog build() {
            if (id == 0 || name == null || type == null) {
                throw new NullPointerException("フィールドに値が設定されていません.");
            }
            return new Dog(this);
        }
    }

    private Dog(Builder builder) {
        this.id   = builder.id;
        this.name = builder.name;
        this.type = builder.type;
    }

    public String info() {
        return String.format(
                "dog.id=%2d, dog.name=%8s, dog.type.type=%12s, \n",
                    this.id,
                    this.name,
                    this.type.type
            );
    }
}
