package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Person implements Serializable {

	private Long id;

	private String name;

}
