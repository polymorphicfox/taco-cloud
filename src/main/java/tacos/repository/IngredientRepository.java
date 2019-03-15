package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.domain.Ingredient;

import java.util.List;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}