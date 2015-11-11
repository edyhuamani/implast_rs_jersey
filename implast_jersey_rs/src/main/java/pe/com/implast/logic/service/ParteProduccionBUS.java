package pe.com.implast.logic.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path(value = "/parteProduccion")
public interface ParteProduccionBUS {
	
	@GET
	@Path(value="/{idNumeroParte}")
	@Produces(value={MediaType.APPLICATION_JSON})
	void getNumeroParte(@PathParam(value = "idNumeroParte")  String idNumeroParte);
	
	@GET
	@Path(value="")
	@Produces(value={MediaType.APPLICATION_JSON})
	List<String> numerosParte();
	
}
