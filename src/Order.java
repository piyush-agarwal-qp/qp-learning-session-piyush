import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<String> items;
    private List<Double> prices;
    double discountedPrice;

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

    public void calculateTotal() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        applyDiscount();
    }

    public void applyDiscount() {
        discountedPrice = totalPrice - (totalPrice * CalculateBill.getDiscountForCustomer(customer.getType()));
    }

    public void printOrder() {
        calculateTotal();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

