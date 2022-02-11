package com.github.dieselniu.charpter9.replaceConditinoalWithPolymorphism6;

//example 2
public class HotelService {

    public double getRoomPrice(final User user, final Room room) {
        double price = room.getPrice();
        if (user.getLevel() == UserLevel.GOLD) {
            return price * 0.8;
        }
        if (user.getLevel() == UserLevel.SILVER) {
            return price * 0.9;
        }
        if (user.getLevel() == UserLevel.PLATINUM) {
            return price * 0.75;
        }
        return price;
    }
}
