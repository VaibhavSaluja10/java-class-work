package abstractions;

//CarRide.java
public class CarRide2 extends Ride2 {

 @Override
 public double calculateFare(int distance) {
     return distance * 12;  // Car: ₹12 per km
 }
}
