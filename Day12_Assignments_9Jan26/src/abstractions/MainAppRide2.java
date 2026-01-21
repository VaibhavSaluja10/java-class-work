
// 2: Ride Booking Application

//   A ride booking app offers different ride types such as Bike, Auto, and Car.
//   Create an abstract class Ride 
// Include:
//    . abstract method calculateFare(int distance) 
//     . concrete method rideDetails()
//     Create classes BikeRide2, AutoRide2
//     , and CarRide2
//     Each ride type calculates fare differently
//     Use abstraction to calculate fares dynamically



package abstractions;

//Main.java
public class MainAppRide2 {
 public static void main(String[] args) {

     Ride2 ride;          // abstraction
     int distance = 10;  // distance in km

     ride = new BikeRide2();
     ride.rideDetails();
     System.out.println("Bike Fare: ₹" + ride.calculateFare(distance));

     ride = new AutoRide2();
     System.out.println("Auto Fare: ₹" + ride.calculateFare(distance));

     ride = new CarRide2();
     System.out.println("Car Fare: ₹" + ride.calculateFare(distance));
 }
}
