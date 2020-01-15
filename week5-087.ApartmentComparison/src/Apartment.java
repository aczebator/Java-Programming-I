
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment) {
        // first we'll compare years
        if ( this.squareMeters < otherApartment.squareMeters ) {
            return false;
        }
        else {
            return true;
        }
        }
    public int priceDifference(Apartment otherApartment)     {
     int difference; 
         difference = (this.pricePerSquareMeter * this.squareMeters) -(otherApartment.pricePerSquareMeter * otherApartment.squareMeters);
        return Math.abs(difference); 
    }
     public boolean moreExpensiveThan(Apartment otherApartment) {
        double cost1 = this.pricePerSquareMeter * this.squareMeters;
        double cost2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
         
         if ( cost1 < cost2 ) {
            return false;
        }
        else {
            return true;
        }
     }
}
