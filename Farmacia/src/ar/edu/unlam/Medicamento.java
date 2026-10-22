package ar.edu.unlam;

import java.time.LocalDateTime;

public class Medicamento {
	private static Integer nuevoCodigo=1;
	private Integer codigo;
	private String nombre;
	private Double precioBase;
	private Integer stock;
	private LocalDateTime fechaVencimiento;

	public Medicamento(Integer codigo, String nombre, Double precioBase, Integer stock,
			LocalDateTime fechaVencimiento) {
		
		this.codigo = nuevoCodigo;
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.stock = stock;
		this.fechaVencimiento = fechaVencimiento;
		nuevoCodigo++;
	}
	
	public static void reiniciarId() {
		nuevoCodigo=1;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public LocalDateTime getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	

}
