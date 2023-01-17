package org.eldorado.week.two.solid.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookEntity {
    String bookTitle;
    String authorName;
    int year;
    double price;
    String isbn;

}
