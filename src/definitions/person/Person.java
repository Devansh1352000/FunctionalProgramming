/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/09/20
 *  Time: 11:08 AM
 *  File Name : Person.java
 * */
package definitions.person;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparator<Person> {
    // Create a Person class and make it comparable with another Person type object.
    private int id;
    private String name;
    private byte age;

    public Person(int id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    // Comparator Interface method
    @Override
    public int compare(Person o1, Person o2) {
        return Byte.compare(o1.age, o2.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return getId() == person.getId() &&
                getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
