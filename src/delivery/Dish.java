package delivery;

public class Dish {

    private String name;
    private Float price;
    private Restaurant restaurant;


    public Dish(String name, Float price, Restaurant restaurant) {
        this.name = name;
        this.price = price;
        this.restaurant=restaurant;
    }


    public String getName() {
        return name;
    }


    public Float getPrice() {
        return price;
    }


    public String getRestaurantName() {
        return restaurant.getName();
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    

    

}
