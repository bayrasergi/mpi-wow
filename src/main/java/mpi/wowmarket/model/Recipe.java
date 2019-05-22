package mpi.wowmarket.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Recipe {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "recipe_id")
    private List<RecipeItem> requiredItems;


    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item createdItem;

    @ManyToOne
    @JoinColumn(name = "profession_id")
    private Profession requiredProfession;
}
