package com.github.dieselniu.charpter9.replaceConditinoalWithPolymorphism6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WebSiteServiceTest {
    @Test
    public void should_be_able_to_get_book_price_when_user_level_is_silver() {
        double bookPrice = new WebSiteService().getBookPrice(new User(UserLevel.SILVER), new Book());
        assertThat(bookPrice).isEqualTo(0.9);

    }

    @Test
    public void should_be_able_to_get_book_price_when_user_level_is_gold() {
        double bookPrice = new WebSiteService().getBookPrice(new User(UserLevel.GOLD), new Book());
        assertThat(bookPrice).isEqualTo(0.8);
    }

    @Test
    public void should_be_able_to_get_book_price_when_user_level_is_platinum() {
        double bookPrice = new WebSiteService().getBookPrice(new User(UserLevel.PLATINUM), new Book());
        assertThat(bookPrice).isEqualTo(0.75);
    }

    @Test
    public void should_be_able_to_get_book_price_when_user_level_is_others() {
        double bookPrice = new WebSiteService().getBookPrice(new User(UserLevel.OTHERS), new Book());
        assertThat(bookPrice).isEqualTo(1.0);
    }

    @Test
    public void epub_price_silver() {
        double epubPrice = new WebSiteService().getEpubPrice(new User(UserLevel.SILVER), new Epub());
        assertThat(epubPrice).isEqualTo(0.95);
    }

    @Test
    public void epub_price_gold() {
        double epubPrice = new WebSiteService().getEpubPrice(new User(UserLevel.GOLD), new Epub());
        assertThat(epubPrice).isEqualTo(0.85);
    }

    @Test
    public void epub_price_platinum() {
        double epubPrice = new WebSiteService().getEpubPrice(new User(UserLevel.PLATINUM), new Epub());
        assertThat(epubPrice).isEqualTo(0.8);
    }

    @Test
    public void epub_price_others() {
        double epubPrice = new WebSiteService().getEpubPrice(new User(UserLevel.OTHERS), new Epub());
        assertThat(epubPrice).isEqualTo(1.0);
    }
}