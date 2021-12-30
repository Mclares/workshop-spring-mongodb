package com.mclares.workshopmongo.dto;

import java.io.Serializable;

import com.mclares.workshopmongo.domain.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;

	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}
}
