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

import de.tum.in.webtech.database.StaticDatabase;
import de.tum.in.webtech.model.Student;
 
@Path("/student")
@Api(value="/students", description="Student Operations")
public class StudentResource {
 
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Student> getAllStudents() {
		return StaticDatabase.getAllStudents();
	}
	 
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	public Student getStudent(@PathParam("id") int id) {
		return StaticDatabase.getStudent(id);
	}
	
	@DELETE
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	public void deleteStudent(@PathParam("id") int id) {
		StaticDatabase.deleteStudent(id);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void postStudent(Student student) {
		StaticDatabase.postStudent(student);
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	public void putStudent(@PathParam("id") int id, Student student) {
		StaticDatabase.putStudent(id, student);
	}
}