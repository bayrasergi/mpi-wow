package mpi.wowmarket.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Recipe {
    int id;
    List<RecipeItem> requiredItems;
    Item createdItem;
    Profession requiredProfession;
}
