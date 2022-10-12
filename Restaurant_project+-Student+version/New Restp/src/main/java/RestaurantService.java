package main.java;

import main.java.Restaurant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName)  {
        //return null;
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
       for (Restaurant find_restaurant: restaurants) {
           if (find_restaurant.getName().equals(restaurantName)) {
               return find_restaurant ;
        }}
        throw new restaurantNotFoundException(restaurantName);
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
