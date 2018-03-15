package rest.ws;

import java.util.Set;
import javax.ws.rs.core.Application;



@javax.ws.rs.ApplicationPath("Resources")

public class ApplicationConfig extends Application 
{
    @Override
    public Set<Class<?>> getClasses() 
    {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) 
    {
        resources.add(rest.ws.ProductResource.class);
        resources.add(rest.ws.RegisterResource.class);
    }
}
