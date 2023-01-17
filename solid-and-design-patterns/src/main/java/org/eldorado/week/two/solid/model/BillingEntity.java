package org.eldorado.week.two.solid.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BillingEntity {
    BookEntity book;
    int quantity;
    double discount;
    double fee;
    double shipping;
    double totalAmount;
}
