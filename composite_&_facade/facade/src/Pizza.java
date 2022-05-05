public class Pizza implements Food {
    private String preparedItems;

    @Override
    public void prepareFood(String itensRequired) {
        this.preparedItems = "Pizza de massa fina com ingredientes - " + itensRequired;
    }

    @Override
    public String deliveryFood() {
        return preparedItems;
    }
}
