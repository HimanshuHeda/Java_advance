package Assignment;

class Restaurant {
    private String roomType;

    public Restaurant(String roomType) {
        this.roomType = roomType;
    }

    public double calculateRent(int stays) {
        switch (roomType) {
            case "Standard":
                return stays * 1000; // Rent per stay in Standard room
            case "Deluxe":
                return stays * 1500; // Rent per stay in Deluxe room
            case "Suite":
                return stays * 2000; // Rent per stay in Suite room
            default:
                return 0;
        }
    }
}

// Example usage
public class RoomRent {
    public static void main(String[] args) {
        Restaurant room1 = new Restaurant("Standard");
        System.out.println("Total rent for 3 stays in Standard room: Rs " + room1.calculateRent(3));

        Restaurant room2 = new Restaurant("Suite");
        System.out.println("Total rent for 2 stays in Suite room: Rs " + room2.calculateRent(2));
    }
}