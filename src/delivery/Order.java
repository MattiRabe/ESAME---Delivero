package delivery;

public class Order {
    private static final Integer INCREMENT = 1;
    private static Integer baseCard = 0;

    private Integer number;
    private String dishname[];
    private int quantity[];
    private String customerName;
    private String restaurantName;
    private int deliveryTime;
    private int deliveryDistance;
    private Boolean delivered;
    

    public Order(String[] dishname, int[] quantity, String customerName, String restaurantName,
            int deliveryTime, int deliveryDistance) {
        this.dishname = dishname;
        this.quantity = quantity;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
        this.deliveryDistance = deliveryDistance;
        this.number= INCREMENT + baseCard++;
        this.delivered=false;
    }

    public String[] getDishname() {
        return dishname;
    }
    public int[] getQuantity() {
        return quantity;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public int getDeliveryTime() {
        return deliveryTime;
    }
    public int getDeliveryDistance() {
        return deliveryDistance;
    }

    public Integer getNumber() {
        return number;
    }

    public Boolean isDelivered(){
        return delivered;
    }

    public void setDelivered(){
        this.delivered=true;
    }
    
}
