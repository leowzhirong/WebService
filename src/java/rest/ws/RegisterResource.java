package rest.ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;
import rest.datamodel.RegisterReq;



@Path("Register")

public class RegisterResource 
{

    @Context
    private UriInfo context;

    
    
    public RegisterResource() 
    {
    }
    
    
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(JAXBElement<RegisterReq> jaxbRegisterReq)
    {
        if((jaxbRegisterReq != null) && (jaxbRegisterReq.getValue() != null))
        {
            try
            {
                RegisterReq registerReq = jaxbRegisterReq.getValue();
                System.err.println("********** JavaRestfulWebServices.RegisterResource.register: " + registerReq.getUsername());
                
                return Response.status(Response.Status.OK).build();
            }
            catch(Exception ex)
            {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            }
        }
        else
        {
            return Response.status(Response.Status.BAD_REQUEST).entity("Invalid register request").build();
        }
    }
}
