package com.mahesh.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class BeanRegister {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BeanRegister(int id, String mobile, String email, String name, String password) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	@Size(min = 10, message = "mobile must be 10 digit.")
	private String mobile;
	/*
	 * @NotBlank beacuse long can not blank
	 */

	@Pattern(regexp = ".+@.+\\.[a-z]+", message = "Email is must.")
	private String email;

	@Size(min = 1, max = 30, message = "Name contain atleast 1 character")
	private String name;

	@Size(min = 1, message = "insert valid password")
	private String password;

	public BeanRegister() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "BeanRegister [id=" + id + ", mobile=" + mobile + ", email=" + email + ", name=" + name + ", password="
				+ password + "]";
	}

}
