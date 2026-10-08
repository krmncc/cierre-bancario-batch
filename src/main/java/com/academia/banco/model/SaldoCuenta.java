package com.academia.banco.model;

import java.math.BigDecimal;
import org.springframework.data.mongodb.core.mapping.Document;

@Id
@Document("saldos")
public record SaldoCuenta(String cuenta, BigDecimal saldo, long movimientos) {
}
