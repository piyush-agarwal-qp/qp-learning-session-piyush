import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public final class Order {
    private final Customer customer;
    private final List<String> items;
    private final List<Double> prices;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public List<String> getItems() {
        return items;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public void printOrder() {
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Items: " + getItems());
    }
}

