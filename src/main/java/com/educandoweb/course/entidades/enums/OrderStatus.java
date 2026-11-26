package com.educandoweb.course.entidades.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus (int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	//METODO PARA CONVERTER O NUMERO EM STATUS. STATIC PARA NAO PRECISAR INSTANCIAR O METODO
	public static OrderStatus valueOf(int code) {
		
		for(OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("INVALID ORDERSTATUS CODE!");
	}
	

}
