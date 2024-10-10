package tacos;

import lombok.Data;

@Data
public class Ingredient {

    private String id;
    private String name;
    private String type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
