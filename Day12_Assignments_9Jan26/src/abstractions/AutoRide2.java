package abstractions;

//AutoRide.java
//AutoRide.java
public class AutoRide2 extends Ride2 {

 @Override
 public double calculateFare(int distance) {
     return distance * 8;   // Auto: ₹8 per km
 }
}

