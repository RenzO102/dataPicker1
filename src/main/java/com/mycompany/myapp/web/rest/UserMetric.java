package com.mycompany.myapp.web.rest;

public class UserMetric {

    public String getDate() {
        return Date;
    }

    public int getYandex() {
        return Yandex;
    }

    public int getMail() {
        return Mail;
    }

    private String Date;
    private int Yandex;
    private int Mail;

    public UserMetric(String Date, int Yandex, int Mail) {
        this.Date = Date;
        this.Yandex = Yandex;
        this.Mail = Mail;
    }
}
