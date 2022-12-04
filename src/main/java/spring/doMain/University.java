package spring.doMain;

import javax.persistence.*;

@Entity
@Table
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    @Column
    private String name;
    @Column
    private int countOfInstitutes;
    @Column
    private int countOfStudents;
    @Column
    private String address;

    public University(String name, int countOfInstitutes, int countOfStudents, String address) {
        this.name = name;
        this.countOfInstitutes = countOfInstitutes;
        this.countOfStudents = countOfStudents;
        this.address = address;
    }

    public University() {
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

    public int getCountOfInstitutes() {
        return countOfInstitutes;
    }

    public void setCountOfInstitutes(int countOfInstitutes) {
        this.countOfInstitutes = countOfInstitutes;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countOfInstitutes=" + countOfInstitutes +
                ", countOfStudents=" + countOfStudents +
                ", address='" + address + '\'' +
                '}';
    }
}
