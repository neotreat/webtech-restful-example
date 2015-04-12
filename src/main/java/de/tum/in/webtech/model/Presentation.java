package de.tum.in.webtech.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * A presentation held by a student.
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */

@XmlRootElement
@ApiModel(value = "A presentation held by a student")
public class Presentation {
	
	/**
	 * The unique identifier of the person.
	 */
	private Integer id;
	
	/**
	 * The title of the presentation.
	 */
	private String title;
	
	/**
	 * The start date of the presentation.
	 */
	private Date startDate;
	
	/**
	 * The end date of the presentation.
	 */
	private Date endDate;
	
	/**
	 * The student presenting.
	 */
	private Student presenter;
	
	/**
	 * Empty default constructor.
	 */
	public Presentation() {
	}
	
	/**
	 * Get the identifier of the presentation.
	 * 
	 * @return	unique identifier
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the identifier of the presentation.
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}	

	/**
	 * Get the title of the presentation.
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the title of the presentation.
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the start date of the presentation.
	 * 
	 * @return	start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Set the start date of the presentation.
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Get the end date of the presentation.
	 * 
	 * @return	end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the end date of the presentation.
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Get the student, who is presenting.
	 * 
	 * @return	presenter
	 */
	public Student getPresenter() {
		return presenter;
	}

	/**
	 * Set the student, who is presenting.
	 * 
	 * @param presenter
	 */
	public void setPresenter(Student presenter) {
		this.presenter = presenter;
	}
}