//package sweng.dante.places;
//

package sweng.dante.places;
public class Park {
    private String name;
    private double latitude;
    private double longitude;

    public Park(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}