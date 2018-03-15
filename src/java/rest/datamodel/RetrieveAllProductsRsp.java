package rest.datamodel;

import entity.Product;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlType(name = "retrieveAllProductsRsp", propOrder = {
    "products"
})

public class RetrieveAllProductsRsp implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private List<Product> products;

    
    
    public RetrieveAllProductsRsp()
    {
    }
    
    
    
    public RetrieveAllProductsRsp(List<Product> products)
    {
        this.products = products;
    }

    
    
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}