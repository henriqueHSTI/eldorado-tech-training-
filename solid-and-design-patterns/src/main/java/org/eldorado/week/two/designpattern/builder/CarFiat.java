package org.eldorado.week.two.designpattern.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarFiat {
    double preco;
    String dscMotor;
    int anoDeFabricacao;
    String modelo;
    String montadora;

}
