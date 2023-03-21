package com.wittybrains.busbookingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wittybrains.busbookingsystem.model.Bus;
@JsonInclude(value = Include.NON_NULL)
public class BusDTO {
	private String number;
    private String type;
    private Long id;
//    private String source;
//    private String destination;
//    private String timing;
    public BusDTO() {
    }
    public BusDTO(Bus busDTO) {
		super();
		
		this.setNumber(busDTO.getNumber());
		this.type = busDTO.getType();
		
    }

//	public String getTiming() {
//		return timing;
//	}
//	public void setTiming(String timing) {
//		this.timing = timing;
//	}
//	public String getSource() {
//		return source;
//	}
//	public void setSource(String source) {
//		this.source = source;
//	}
//	public String getDestination() {
//		return destination;
//	}
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
//	public void setId(Long id) {
//		this.id = id;
//	}
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
}