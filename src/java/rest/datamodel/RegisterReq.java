package rest.datamodel;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlType(name = "registerReq", propOrder = {
    "username"
})

public class RegisterReq 
{
    private static final long serialVersionUID = 1L;
    
    private String username;

    
    
    public RegisterReq() 
    {
    }

    
    
    public RegisterReq(String username) 
    {
        this.username = username;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}