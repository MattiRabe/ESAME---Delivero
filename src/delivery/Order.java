package delivery;

public class Order {
    private static final Integer INCREMENT = 1;
    private static Integer baseCard = 0;

    private Integer number;
    private String dishname[];
    private Integer quantity[];
    private String customerName;
    private String restaurantName;
    

    public Order(String[] dishname, Integer[] quantity, String customerName, String restaurantName,
            Integer deliveryTime, Integer deliveryDistance) {
        this.dishname = dishname;
        this.quantity = quantity;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
        this.deliveryDistance = deliveryDistance;
        this.number= INCREMENT + baseCard++;
    }


    private Integer deliveryTime;
    private Integer deliveryDistance;

    public String[] getDishname() {
        return dishname;
    }
    public Integer[] getQuantity() {
        return quantity;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public Integer getDeliveryTime() {
        return deliveryTime;
    }
    public Integer getDeliveryDistance() {
        return deliveryDistance;
    }

    
}
