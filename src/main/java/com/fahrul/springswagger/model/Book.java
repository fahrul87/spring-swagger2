package com.fahrul.springswagger.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Serializable {

	private static final Long serialVersionUID = -1670893016517855654L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value = "auto generate ID")
	private int bookid;

	@ApiModelProperty(value = "this is book name")
	private String bookName;

	@ApiModelProperty(value = "this is book price")
	private double price;

}
