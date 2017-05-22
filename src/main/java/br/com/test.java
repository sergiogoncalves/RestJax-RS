
package br.com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/TestClass")
public class test {
    private String value="Hello";
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHello(){
        return value;
    }
    
}
