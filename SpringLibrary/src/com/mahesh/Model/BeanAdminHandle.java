package com.mahesh.Model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BeanAdminHandle {

	private int id;
	private boolean aprv;

	public int getId() {
		return id;
	}

	public BeanAdminHandle(int id, boolean aprv, String mobile, String email, String name, String password) {
		super();
		this.id = id;
		this.aprv = aprv;
		this.mobile = mobile;
		this.email = email;
		this.name = name;
		this.password = password;
	}
 

	public boolean getAprv() {
		return aprv;
	}

	public void setAprv(boolean aprv) {
		this.aprv = aprv;
	}

	public void setId(int id) {
		this.id = id;
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

	public BeanAdminHandle() {
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
		return "BeanAdminHandle [id=" + id + ", aprv=" + aprv + ", mobile=" + mobile + ", email=" + email + ", name="
				+ name + ", password=" + password + "]";
	}

}
