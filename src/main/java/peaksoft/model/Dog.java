package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    private String name;
    private String age;

    private AnimalsCage animalsCage;

    public Dog() {
    }

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name +", "+ "age: " + age;
    }
}
