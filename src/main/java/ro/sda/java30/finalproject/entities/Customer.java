package ro.sda.java30.finalproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.sda.java30.finalproject.model.ApplicationRole;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String email;
    private Integer phoneNumber;
    private ApplicationRole applicationRole;
    @ManyToMany
            @JoinTable(name="customer_equipment", joinColumns = @JoinColumn(name="customer_id"), inverseJoinColumns = @JoinColumn(name="equipment_id"))
    private List<Equipment> equipments;

    @ManyToMany
    @JoinTable(name="customer_instructor", joinColumns = @JoinColumn(name="customer_id"), inverseJoinColumns = @JoinColumn(name="instructor_id"))
    private List<Instructor> instructors;

}
