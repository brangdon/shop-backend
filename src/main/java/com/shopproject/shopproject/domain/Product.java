package com.shopproject.shopproject.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 24.01.2019.
 */


@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "title", nullable = false)
    @Length(min = 5, message = "*Name must have at least 5 characters")
    private String title;

    @Column(name = "author", nullable = false)
    @Length(min = 5, message = "*Name must have at least 5 characters")
    private String author;

    @Column(name = "price", nullable = false)
    @DecimalMin(value = "0.00", message = "*Price has to be a non negative number")
    private Double price;

    @Column(name = "description", nullable = false)
    private String description;

    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "categories", nullable = false)
    private List<String> categories;

    @Column(name = "photo", nullable = false)
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

    public Product(Long id, @NotEmpty String title, @NotEmpty String author, Double price, @NotEmpty String description, List<String> categories, @NotEmpty String photo) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
        this.photo = photo;
        this.categories = categories;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
