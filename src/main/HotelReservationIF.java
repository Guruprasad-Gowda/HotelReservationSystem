package workshop;

import java.util.ArrayList;

interface HotelReservationIF {

    void addHotel(String hotelName, long regularCustomerRate);

    int getHotelListSize();

    void printHotelList();

    ArrayList<Hotel> getHotelList();
}
