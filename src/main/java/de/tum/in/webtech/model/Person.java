package de.tum.in.webtech.model;

/**
 * Abstract person class as stencil for students, professors, etc.
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */
public abstract class Person {
	
	/**
	 * The unique identifier of the person.
	 */
	private Integer id;
	
	/**
	 * The first name of the person.
	 */
	private String firstName;
	
	/**
	 * The last name of the person.
	 */
	private String lastName;
	
	/**
	 * The email address of the person.
	 */
	private String email;
	
	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}