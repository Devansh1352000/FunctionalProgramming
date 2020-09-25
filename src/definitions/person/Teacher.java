/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/09/20
 *  Time: 10:04 AM
 *  File Name : Teacher.java
 * */
package definitions.person;

import java.util.Comparator;
import java.util.Objects;

public class Teacher implements Comparable<Teacher>, Comparator<Teacher> {
    // The above line means, we want to compare an object of a Teacher
    // class with another object of Teacher class only.
    private int id;
    private String name;
    private String subjectCode;
    private double salary;

    public Teacher(int id, String name, String subjectCode, double salary) {
        this.id = id;
        this.name = name;
        this.subjectCode = subjectCode;
        this.salary = salary;
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

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Name: %s, Subject: %s, Salary: %.2f\n",
                this.getId(),
                this.getName(),
                this.getSubjectCode(),
                this.getSalary()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) o;
        return getId() == teacher.getId() &&
                Double.compare(teacher.getSalary(), getSalary()) == 0 &&
                Objects.equals(getName(), teacher.getName()) &&
                Objects.equals(getSubjectCode(), teacher.getSubjectCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSubjectCode(), getSalary());
    }

    // Comparable Interface
    @Override
    public int compareTo(Teacher otherTeacher) {
        return Double.compare(this.getSalary(), otherTeacher.getSalary());
    }

    // Comparator Interface
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}
