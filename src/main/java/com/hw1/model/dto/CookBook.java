package com.hw1.model.dto;

public class CookBook {

    private boolean coupon;
    private String title;
    private String author;
    private String publisher;
    public CookBook() {
    }

    public CookBook(boolean coupon, String title, String author, String publisher) {
        this.coupon = coupon;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

