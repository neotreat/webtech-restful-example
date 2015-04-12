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
	
	/**
	 * Empty default constructor.
	 */
	public Person() {
	}

	/**
	 * Get the identifier of the person.
	 * 
	 * @return	unique identifier
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the identifier of the person.
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Get the first name of the person.
	 * 
	 * @return	first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name of the person.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the last name of the person.
	 * 
	 * @return	last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name of the person.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the email address of the person.
	 * 
	 * @return	email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email address of the person.
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}	
}