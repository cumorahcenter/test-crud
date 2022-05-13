package org.cumorah_center.service;

import org.cumorah_center.archetype.CrudArchetype;
import org.cumorah_center.entity.TestCrud;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Gabriel Aguilera on 03-05-2022
 */
@Path("/crud")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestCrudService extends CrudArchetype<TestCrud, String> {

}
