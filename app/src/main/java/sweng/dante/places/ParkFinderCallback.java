package sweng.dante.places;

import java.util.List;

public interface ParkFinderCallback {
    void onParksFound(List<Park> parkList);
}
