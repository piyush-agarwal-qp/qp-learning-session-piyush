import customer.CustomerType;

import java.util.List;

public class CalculateBill {

    private CalculateBill() {
    }

    public static double getDiscountForCustomer(CustomerType customerType) {
        switch (customerType) {
            case REGULAR:
                return 0.05;
            case PREMIUM:
                return 0.1;
            case VIP:
                return 0.2;
            default:
                return 0.0;
        }
    }

    public static double calculateTotal(List<Double> prices) {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public static double applyDiscount(double totalPrice, CustomerType customerType) {
        return totalPrice - (totalPrice * CalculateBill.getDiscountForCustomer(customerType));
    }


}
