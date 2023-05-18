package com.firas.weapon.dto;

import java.util.Date;

import com.firas.weapon.entities.Class;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeaponDTO {
	private Long idWp;
	private String nomWp;
	private Double prixWp;
	private Date dateWp;
	
	private Class classe;
	
	private String nomClass;
	
	

}
