package customer;

public final class Customer {
    private final String name;
    private final CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public CustomerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "name: " + getName()
                + " : "
                + "type: " + getType().getValue();
    }
}
