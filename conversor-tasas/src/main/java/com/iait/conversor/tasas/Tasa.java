package com.iait.conversor.tasas;

import java.math.BigDecimal;

public class Tasa {

    private BigDecimal valorTasa;
    private Integer modulo;
    private Integer diasAmortizacion;

    public static Tasa of(BigDecimal valorTasa, Integer modulo, Integer diasAmortizacion) {
        return new Tasa(valorTasa, modulo, diasAmortizacion);
    }

    private Tasa(BigDecimal valorTasa, Integer modulo, Integer diasAmortizacion) {
        this.valorTasa = valorTasa;
        this.modulo = modulo;
        this.diasAmortizacion = diasAmortizacion;
    }

    public BigDecimal getValorTasa() {
        return valorTasa;
    }

    public Integer getModulo() {
        return modulo;
    }

    public Integer getDiasAmortizacion() {
        return diasAmortizacion;
    }
}
