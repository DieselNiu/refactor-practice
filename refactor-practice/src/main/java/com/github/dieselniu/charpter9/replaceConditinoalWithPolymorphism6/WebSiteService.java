package com.github.dieselniu.charpter9.replaceConditinoalWithPolymorphism6;

//example 1
public class WebSiteService {

    public double getBookPrice(final User user, final Book book) {
        double price = book.getPrice();
        switch (user.getLevel()) {
            case SILVER:
                return price * 0.9;
            case GOLD:
                return price * 0.8;
            case PLATINUM:
                return price * 0.75;
            default:
                return price;
        }
    }


    public double getEpubPrice(final User user, final Epub epub) {
        double price = epub.getPrice();
        switch (user.getLevel()) {
            case SILVER:
                return price * 0.95;
            case GOLD:
                return price * 0.85;
            case PLATINUM:
                return price * 0.8;
            default:
                return price;
        }
    }
}
