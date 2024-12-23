package com.github.bjan816.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public Review(String body) { // Since ids are auto-generated, we cannot pass an id to this class. So we will generate a custom constructor that takes only the body, on top of the AllArgs/NoArgsConstructor.
        this.body = body;
    }
}
