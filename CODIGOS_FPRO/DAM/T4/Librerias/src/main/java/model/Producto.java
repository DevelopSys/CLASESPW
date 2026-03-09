package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@lombok.Data
public class Producto implements Serializable {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private long stock;
    private List<String> tags;
    private String brand;
    private String sku;
    private long weight;
    private Dimensions dimensions;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private List<Review> reviews;
    private String returnPolicy;
    private long minimumOrderQuantity;
    private Meta meta;
    private List<String> images;
    private String thumbnail;

    public void mostrarDatos(){
        System.out.printf("Id: %d nombre:%s  precio: %.2f%n",id,title,price);
    }
    public void mostrarResenias(){
        reviews.stream().map(Review::getComment).forEach(System.out::println);
    }
}


// Dimensions.java
@lombok.Data
class Dimensions {
    private double width;
    private double height;
    private double depth;
}

// Meta.java
@lombok.Data
class Meta {
    @JsonIgnore
    private OffsetDateTime createdAt;
    @JsonIgnore
    private OffsetDateTime updatedAt;
    private String barcode;
    private String qrCode;
}

// Review.java


@lombok.Data
class Review {
    private long rating;
    private String comment;
    @JsonIgnore
    private OffsetDateTime date;
    private String reviewerName;
    private String reviewerEmail;
}

