package rest.ws;

import entity.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import rest.datamodel.RetrieveAllProductsRsp;



@Path("Product")

public class ProductResource
{
    @Context
    private UriInfo context;

    
    
    public ProductResource() 
    {
    }

    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveAllProducts()
    {
        List<Product> products = new ArrayList<>();
        
        products.add(new Product(1l, "PROD001", "Product A1", "Product A1", 10, 5, new BigDecimal("10.00"), "Category A", 3));
        products.add(new Product(2l, "PROD002", "Product A2", "Product A2", 10, 5, new BigDecimal("25.50"), "Category A", 3));
        products.add(new Product(3l, "PROD003", "Product A3", "Product A3", 10, 5, new BigDecimal("15.00"), "Category A", 3));
        products.add(new Product(4l, "PROD004", "Product B1", "Product B1", 10, 5, new BigDecimal("20.00"), "Category B", 4));
        products.add(new Product(5l, "PROD005", "Product B2", "Product B2", 10, 5, new BigDecimal("10.00"), "Category B", 4));
        products.add(new Product(6l, "PROD006", "Product B3", "Product B3", 10, 5, new BigDecimal("100.00"), "Category B", 4));
        products.add(new Product(7l, "PROD007", "Product C1", "Product C1", 10, 5, new BigDecimal("35.00"), "Category C", 5));
        products.add(new Product(8l, "PROD008", "Product C2", "Product C2", 10, 5, new BigDecimal("20.05"), "Category C", 5));
        products.add(new Product(9l, "PROD009", "Product C3", "Product C3", 10, 5, new BigDecimal("5.50"), "Category C", 5));
              
        return Response.status(Status.OK).entity(new RetrieveAllProductsRsp(products)).build();
    }
}
