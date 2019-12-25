package com.knowledgefactory.VO;

public class UserVo {

	private Long id;
	private String name;
	private String lastname;
	private String email;
	private String pin;
	public Long getId() {
		return id;
	}
	public UserVo() {
		super();
	}
	public UserVo(Long id, String name, String lastname, String email,
			String pin) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.pin = pin;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	

}
