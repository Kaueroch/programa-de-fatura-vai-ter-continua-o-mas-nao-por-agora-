package com.aplicacaofatura.diario;

public class fatura {
	 private String desc;
	  private String Data;
	  private double valor;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void verifica() {
	    this.desc=desc;
	    this.valor = valor;
	    this.Data=Data;
	}
}
