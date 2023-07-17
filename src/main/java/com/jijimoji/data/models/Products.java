package com.jijimoji.data.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document("Products")
public class Products {
    @Id
    private String id;
    private String location;
    @CreatedDate
    private LocalDateTime dateTimePosted;
    private String name;
    private String productName;
    private String description;
    private BigDecimal price;
}
