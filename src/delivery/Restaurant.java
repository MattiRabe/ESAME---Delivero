package delivery;

import java.util.LinkedList;

public class Restaurant {

    private String name;
    private String category;
    private LinkedList<Integer> ratings = new LinkedList<>();

    public Restaurant(String name, String category){
        this.name=name;
        this.category=category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public LinkedList<Integer> getRatings() {
        return ratings;
    }

    public void addRating(Integer r){
        ratings.add(r);
    }

    public Double getAverage(){
        if(ratings.size()==0) return 0.0;
        Double d=0.0;
        for(Integer i: ratings) d+=i;
        d=d/ratings.size();
        return d;
    }

}
