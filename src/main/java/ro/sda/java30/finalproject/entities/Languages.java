package ro.sda.java30.finalproject.entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Languages{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String language;

    @ManyToMany (mappedBy = "languages")
    private List<Instructor> instructors;

}
