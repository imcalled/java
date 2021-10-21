package com.queenie.garage;

import java.util.ArrayList;

//        Exercise 2:

public class Main {
 public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<Car>();
    Car bmw = new Car("car1","bmw");
    Car ford = new Car("car2","ford");
    Car mini = new Car("cooper","mini");

    cars.add(bmw);
    cars.add(ford);
    cars.add(mini);

    Garage garage = new Garage();
 }
}
