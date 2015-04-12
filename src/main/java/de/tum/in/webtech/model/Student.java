package de.tum.in.webtech.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * A student of the TUM.
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */

@XmlRootElement
@ApiModel(value = "A student of the TUM")
public class Student extends Person {
	
	/**
	 * The matriculationNumber of the student.
	 */
	private int matriculationNumber;
	
	public Student() {
	}

	public int getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}
}