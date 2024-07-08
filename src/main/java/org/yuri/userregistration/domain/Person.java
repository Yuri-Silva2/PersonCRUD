package org.yuri.userregistration.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="person")
@Table(name="person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Person {

    @Id @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;

    public Person(PersonDTO personDTO) {
        this.id = personDTO.id();
        this.name = personDTO.name();
        this.password = personDTO.password();
    }
}
