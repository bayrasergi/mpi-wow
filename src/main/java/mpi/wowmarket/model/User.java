package mpi.wowmarket.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User{
    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @Column
    UserRole userRole;
}
