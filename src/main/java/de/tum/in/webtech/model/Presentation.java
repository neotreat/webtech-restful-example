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
	
	public Presentation() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Student getPresenter() {
		return presenter;
	}

	public void setPresenter(Student presenter) {
		this.presenter = presenter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}