package com.dondex.ddmongodb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "business")
public class Business {

    @Id
    private String id;
    private String name;
    private String description;
    private String type;
    private String address;
    private Float latitude;
    private Float longitude;

}
