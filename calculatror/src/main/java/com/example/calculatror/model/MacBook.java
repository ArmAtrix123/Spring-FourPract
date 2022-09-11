package com.example.calculatror.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class MacBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotEmpty(message = "Как вы собираетесь продать MacBook без названия?")
    @Size(message = "MacBook с таким коротким названием еще не придумали" , min = 6, max = 50)
    String title;

    @NotEmpty(message = "Как вы собираетесь продать MacBook без описания?")
    @Size(message = "Расскажите больше о MacBook" , min = 5, max = 50)
    String text;

    @NotNull(message = "Бессцветный MacBook?")
    @Size(message = "Такого корткого названия цвета вроде нет",  min = 1, max = 50)
    String color;

    @NotNull(message = "MacBook без цены? Что-то новое")
    @Min(message = "Слишком мало цифр, больше делай", value = 5)
    Integer price;

    @NotNull(message = "Как это нет объема памяти?")
    @Min(message = "Слишком маленький", value = 36)
    Integer size;

    public MacBook() {
    }
    public MacBook(String title, String text, String color, Integer price, Integer size) {
        this.title = title;
        this.text = text;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}