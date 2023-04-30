package mk.ukim.finki.emtlab.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String continent;

    public Country(){

    }
    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }
}
