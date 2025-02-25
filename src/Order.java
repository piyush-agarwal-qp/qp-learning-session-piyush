import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<String> items;
    private List<Double> prices;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public void setPrices(List<Double> prices) {
        this.prices = prices;
    }

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
    }
}

