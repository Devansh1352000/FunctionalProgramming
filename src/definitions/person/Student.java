/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/09/20
 *  Time: 11:04 AM
 *  File Name : Student.java
 * */
package definitions.person;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>, Comparator<Student> {
    private int rollNumber;
    private String name;
    private float marks;

    public Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return getRollNumber() == student.getRollNumber() &&
                Float.compare(student.getMarks(), getMarks()) == 0 &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNumber(), getName(), getMarks());
    }

    @Override
    public String toString() {
        return String.format(
                "%d: \"%s\" - %.2f\n",
                getRollNumber(),
                getName(),
                getMarks()
        );
    }

    // Comparable Interface
    @Override
    public int compareTo(Student otherStudent) {
        return Float.compare(this.getMarks(), otherStudent.getMarks());
    }

    // Comparator Interface
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
