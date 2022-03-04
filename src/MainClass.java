public class MainClass {

    public static void main(String[] args) {
        Product tomato = new Product(), mushrooms = new Product(), bread = new Product();

        Pizza pizza = new Pizza(tomato, mushrooms, bread);
    }

}
