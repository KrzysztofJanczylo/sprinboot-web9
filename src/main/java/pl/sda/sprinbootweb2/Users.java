package pl.sda.sprinbootweb2;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table
public class Users {


    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
