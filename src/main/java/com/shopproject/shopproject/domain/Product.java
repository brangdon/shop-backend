package com.shopproject.shopproject.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by admin on 24.01.2019.
 */


@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String author;

//    @NotEmpty
    private Double price;

    @NotEmpty
    private String description;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> categories;
    //
    @NotEmpty
    private String photo;

    public Product() {
    }

    public Product(@NotEmpty String title, @NotEmpty String author,  double price, @NotEmpty String description, List<String> categories, @NotEmpty String photo) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
        this.categories = categories;
        this.photo = photo;
    }

    public Product(Product p) {
        this.title = p.getTitle();
        this.author = p.getAuthor();
        this.price = p.getPrice();
        this.description = p.getDescription();
        this.categories= p.getCategories();
        this.photo = p.getPhoto();
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
