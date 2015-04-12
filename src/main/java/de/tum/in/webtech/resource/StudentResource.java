package de.tum.in.webtech.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


import de.tum.in.webtech.database.StaticDatabase;
import de.tum.in.webtech.model.Student;
 
/**
 * Resource for the students.
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */
@Path("/student")
@Api(value="/students", description="Student Operations")
public class StudentResource {
 
	/**
	 * Get all stored students.
	 * 
	 * @return	list of all students.
	 */
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@ApiOperation(value = "Get all students", response = Student.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Returned list of students"),
		    @ApiResponse(code = 204, message = "No students available"),
		    @ApiResponse(code = 500, message = "Internal server error due to encoding the data"),
		    @ApiResponse(code = 400, message = "Bad request due to decoding the data"),
		    @ApiResponse(code = 412, message = "Pre condition failed due to required data not found") })
	public List<Student> getAllStudents() {
		return StaticDatabase.getAllStudents();
	}
	
	/**
	 * Get the student with the given identifier.
	 * 
	 * @param id
	 * @return	student
	 */
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	@ApiOperation(value = "Get a student by its id", response = Student.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Given student found"),
		    @ApiResponse(code = 404, message = "Given student not found"),
		    @ApiResponse(code = 500, message = "Internal server error due to encoding the data"),
		    @ApiResponse(code = 400, message = "Bad request due to decoding the data"),
		    @ApiResponse(code = 412, message = "Pre condition failed due to required data not found") })
	public Student getStudent(@PathParam("id") int id) {
		return StaticDatabase.getStudent(id);
	}
	
	/**
	 * Delete the student with the given identifier.
	 * 
	 * @param id
	 */
	@DELETE
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	@ApiOperation(value = "Delete a student by its id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Given student deleted"),
		    @ApiResponse(code = 404, message = "Given student not found"),
		    @ApiResponse(code = 500, message = "Internal server error due to encoding the data"),
		    @ApiResponse(code = 400, message = "Bad request due to decoding the data"),
		    @ApiResponse(code = 412, message = "Pre condition failed due to required data not found") })
	public void deleteStudent(@PathParam("id") int id) {
		StaticDatabase.deleteStudent(id);
	}
	
	/**
	 * Create a new student.
	 * 
	 * @param student
	 */
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@ApiOperation(value = "Create a new student")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "New student created"),
		    @ApiResponse(code = 500, message = "Internal server error due to encoding the data"),
		    @ApiResponse(code = 400, message = "Bad request due to decoding the data"),
		    @ApiResponse(code = 412, message = "Pre condition failed due to required data not found") })
	public void postStudent(Student student) {
		StaticDatabase.postStudent(student);
	}
	
	/**
	 * Update the student with the given identifier.
	 * 
	 * @param id
	 * @param student
	 */
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	@ApiOperation(value = "Update an existing student by its id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Given student updated"),
		    @ApiResponse(code = 500, message = "Internal server error due to encoding the data"),
		    @ApiResponse(code = 400, message = "Bad request due to decoding the data"),
		    @ApiResponse(code = 412, message = "Pre condition failed due to required data not found") })
	public void putStudent(@PathParam("id") int id, Student student) {
		StaticDatabase.putStudent(id, student);
	}
}