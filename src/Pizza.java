import java.util.Arrays;
import java.util.List;

public class Pizza extends Container {

    private List<Product> ingredients;

    public Pizza(Product... ingredients) {
        this.ingredients = Arrays.stream(ingredients).toList();
    }

    @Override
    public Container createContainer(Product... ingredients) {
        return new Pizza(ingredients);
    }

}
