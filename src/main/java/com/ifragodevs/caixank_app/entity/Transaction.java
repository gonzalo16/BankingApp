package com.ifragodevs.caixank_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor // Constructor con todos los parámetros
@NoArgsConstructor
@Entity
public class Transaction {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "cuenta_origen_id")
	private Account accountOrigin;
	
	@ManyToOne
	@JoinColumn(name = "cuenta_destino_id")
	private Account accountDestiny;
	
		
	@Enumerated(EnumType.STRING) 
	private TransactionStatus transactionStatus;
	
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;
}
