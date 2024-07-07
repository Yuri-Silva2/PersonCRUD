package org.yuri.userregistration.model;

import jakarta.persistence.*;
import lombok.*;
import org.yuri.userregistration.dtos.PersonDTO;

@Entity(name="person")
@Table(name="person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Person {

    @Id
    private String id;
    private String name;
    private String password;

    public Person(PersonDTO personDTO) {
        this.id = personDTO.id();
        this.name = personDTO.name();
        this.password = personDTO.password();
    }
}
