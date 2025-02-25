import customer.Customer;
import customer.CustomerType;

public class OrderManagementSystem {

    public static void main(String[] args) {
        Order order = generateOrder();
        order.printOrder();
        generateInvoice(order);
    }

    private static Order generateOrder() {
        Customer customer = new Customer("John Doe", CustomerType.VIP);
        Order order = new Order(customer);
        addItems(order);
        return order;
    }

    private static void addItems(Order order) {
        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);
    }

    private static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        order.printOrder();
        double totalOrderPrice = CalculateBill.calculateTotal(order.getPrices());
        System.out.println("Total Price: " + totalOrderPrice);
        double discountPrice = CalculateBill.applyDiscount(totalOrderPrice, order.getCustomer().getType());
        System.out.println("Discounted Price: " + discountPrice);
        System.out.println("Thank you for shopping with us!");
    }
}
