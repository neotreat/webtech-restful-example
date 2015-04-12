package de.tum.in.webtech.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A student of the TUM.
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */

@XmlRootElement
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