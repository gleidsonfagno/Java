package zona_fit.domain;

import java.util.Objects;

public class Client {
    private int id;
    private String name;
    private String surname;
    private int membership;


    public Client() {
    }
    public Client(int id) {
        this.id = id;
    }

    public Client(String name, String surname, int membership) {
        this.name = name;
        this.surname = surname;
        this.membership = membership;
    }

    public Client(int id, String name, String surname, int membership) {
        this(name, surname, membership);
        this.id = id;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", membership=" + membership +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Client client)) return false;
        return getId() == client.getId() && getMembership() == client.getMembership() && Objects.equals(getName(), client.getName()) && Objects.equals(getSurname(), client.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getMembership());
    }
}
