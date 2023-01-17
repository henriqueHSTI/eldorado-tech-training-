package org.eldorado.week.two.solid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class BookEntity {
    String bookTitle;
    String authorName;
    int year;
    double price;
    String isbn;

}
