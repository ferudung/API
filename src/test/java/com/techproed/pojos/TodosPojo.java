package com.techproed.pojos;

public class TodosPojo {

    //                  "userId": 21,
    //                  "id": 201,
    //                  "title": "Tidy your room",
    //                  "completed": false

    //1-değişkenleri private yapıyoruz
    private int userId;
    private int id;
    private String title;
    private Boolean completed;

    //2- bu degerleri ulasabilmek için public geter ve seter methodlar olusturmalıyım

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
//3- parametreli ve parametresiz constructor olusturuyoruz
    public TodosPojo() {

    }

    public TodosPojo(int userId, int id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;

    }

    //4-toString metodu olusturuyoruz

    @Override
    public String toString() {
        return "TodosPojo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
