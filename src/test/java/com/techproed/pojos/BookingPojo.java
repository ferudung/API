package com.techproed.pojos;

public class BookingPojo {


        //        "firstname": "Selim",
        //         "lastname": "Ak",
        //        "totalprice": 15000,
        //       "depositpaid": true,
        //        "bookingdates": {
        //            "checkin": "2020-09-09",
        //          "checkout": "2020-09-21"

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDatePojo bookingdates;//daha önce olusturduğumuz BookinDatePojo kalıbını
                                        //data type olarak yeni pojo nun içerisine gömmüş oldum.


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BookingDatePojo getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDatePojo bookingdates) {
        this.bookingdates = bookingdates;
    }

    public BookingPojo() {
    }

    public BookingPojo(String firstname, String lastname, int totalprice, boolean depositpaid, BookingDatePojo bookingdates) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
    }

    @Override
    public String toString() {
        return "BookingPojo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdates=" + bookingdates +
                '}';
    }
}
