package com.GestioneDispositivi.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "dispositivi")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dispositivo;
	@Enumerated(EnumType.STRING)
	private StatoDispositivo statodispositivo;
	private TipoDispositivo tipodispositivo;
}
