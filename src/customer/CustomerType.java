package customer;

public enum CustomerType {

    REGULAR("Regular", 1),
    PREMIUM("Premium", 2),
    VIP("VIP", 3);

    private int type;
    private String value;

    CustomerType(String value, int type){
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public static String getCustomerType(int shows) {
        for (CustomerType customerType: CustomerType.values()) {
            if (shows == customerType.getType())
                return customerType.getValue();
        }
        return null;
    }

}
