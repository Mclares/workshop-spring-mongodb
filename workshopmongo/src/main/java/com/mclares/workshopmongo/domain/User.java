package com.mclares.workshopmongo.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
}
