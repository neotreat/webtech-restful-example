package de.tum.in.webtech.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import de.tum.in.webtech.database.StaticDatabase;
import de.tum.in.webtech.model.Presentation;
import de.tum.in.webtech.model.Student;

/**
 * Resource for the presentations.
 * 
 * @author René Milzarek <rene.milzarek@in.tum.de>
 */
@Path("/presentation")
@Api(value="/presentation", description="Presentation Operations")
public class PresentationResource {

	/**
	 * Get all presentations.
	 * 
	 * @return	list of all presentations
	 */
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@ApiOperation(value = "Get all presentations", response = Presentation.class)
	public List<Presentation> getAllPresentations() {
		return StaticDatabase.getAllPresentations();
	}
	
	/**
	 * Get the presentation with the given identifier.
	 * 
	 * @param id
	 * @return	presentation
	 */
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	@ApiOperation(value = "Get a presentations by its id", response = Presentation.class)
	public Presentation getPresentation(@PathParam("id") int id) {
		return StaticDatabase.getPresentation(id);
	}
	
	/**
	 * Delete the presentation with the given identifier.
	 * 
	 * @param id
	 */
	@DELETE
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	@ApiOperation(value = "Delete a presentation by its id")
	public void deletePresentation(@PathParam("id") int id) {
		StaticDatabase.deletePresentation(id);
	}
	
	/**
	 * Update the presentation with the given identifier.
	 * 
	 * @param id
	 * @param presentation
	 */
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{id}")
	@ApiOperation(value = "Update an existing presentation by its id")
	public void putPresentation(@PathParam("id") int id, Presentation presentation) {
		StaticDatabase.putPresentation(id, presentation);
	}
}
