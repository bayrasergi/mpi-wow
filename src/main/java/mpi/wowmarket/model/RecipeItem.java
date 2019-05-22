package mpi.wowmarket.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RecipeItem {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column
    private int itemsRequired;
}
