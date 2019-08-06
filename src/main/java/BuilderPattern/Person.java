package BuilderPattern;

import lombok.Data;

/**
 * Class Description
 *
 * @author zoup
 */
@Data
public class Person {
    private String name;
    private int age;
    private boolean isMale;
    private int height;
    private int weight;

    private Person() {}

    public static class Builder {
        private String name;
        private int age;
        private boolean isMale;
        private int height;
        private int weight;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder isMale(boolean isMale) {
            this.isMale = isMale;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.isMale = this.isMale;
            person.height = this.height;
            person.weight = this.age;

            return person;
        }

    }

}
