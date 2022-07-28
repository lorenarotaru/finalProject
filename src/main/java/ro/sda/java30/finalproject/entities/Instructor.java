package ro.sda.java30.finalproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instructor {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer phoneNumber;
    private String experience;
    private String certifications;
    private String description;
    @Lob
    private byte[] photo;
    @ManyToMany (mappedBy = "instructors")
    private List<Customer> customers;

    @ManyToMany
    @JoinTable (name="instructor_languages", joinColumns =@JoinColumn(name="instructor_id"), inverseJoinColumns = @JoinColumn(name="languages_id"))
    private List<Languages> languages;

    @ManyToMany
    @JoinTable (name="instructor_specialization", joinColumns =@JoinColumn(name="instructor_id"), inverseJoinColumns = @JoinColumn(name="specialization_id"))
    private  List<Specialization> specializations;
}
