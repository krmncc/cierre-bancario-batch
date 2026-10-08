package com.academia.banco.model;

import java.math.BigDecimal;
import org.springframework.data.mongodb.core.mapping.Document;

// Sin @Id: MongoDB generará un ObjectId() nuevo en cada inserción
@Document("saldos")
public record SaldoCuenta(String cuenta, BigDecimal saldo, long movimientos) {
}
