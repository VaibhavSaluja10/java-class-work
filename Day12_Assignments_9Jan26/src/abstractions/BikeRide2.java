package abstractions;

//BikeRide.java
//BikeRide.java
public class BikeRide2 extends Ride2 {

 @Override
 public double calculateFare(int distance) {
     return distance * 5;   // Bike: ₹5 per km
 }
}
