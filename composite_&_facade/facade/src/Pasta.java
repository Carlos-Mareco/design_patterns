public class Pasta implements Food {
    private String preparedItems;

    @Override
    public void prepareFood(String itensRequired) {
        this.preparedItems = "Macarrão com tomate com ingredientes - " + itensRequired;
    }

    @Override
    public String deliveryFood() {
        return preparedItems;
    }
}
