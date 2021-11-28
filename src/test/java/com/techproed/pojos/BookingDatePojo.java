package com.techproed.pojos;

public class BookingDatePojo {
    //  "checkin": "2020-09-09",
    //    //                   "checkout": "2020-09-21"

    //private değişkenler
    private  String checkin;
    private String checkout;

    //2-geter ve ster methodlar


    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
    //3- coostructor olustur

    public BookingDatePojo() {
    }

    public BookingDatePojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    //4-toString methodu olustur

    @Override
    public String toString() {
        return "BookingDatePojo{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }
}
