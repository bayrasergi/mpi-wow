package mpi.wowmarket.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Profession {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private int name;

    @Column
    private boolean craft;
}
