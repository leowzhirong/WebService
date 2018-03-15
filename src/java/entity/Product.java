package entity;

import java.io.Serializable;
import java.math.BigDecimal;



public class Product implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Long productId;
    private String skuCode; 
    private String name;    
    private String description;    
    private Integer quantityOnHand;
    private Integer reorderQuantity;
    private BigDecimal unitPrice;    
    private String category;
    private Integer productRating;

    
    
    public Product() 
    {
		productId = 0l;
        quantityOnHand = 0;
        reorderQuantity = 0;
        unitPrice = new BigDecimal("0.00");
        productRating = 1;        
    }

    
    
    public Product(Long productId, String skuCode, String name, String description, Integer quantityOnHand, Integer reorderQuantity, BigDecimal unitPrice, String category, Integer productRating) 
    {
		this.productId = productId;
        this.skuCode = skuCode;
        this.name = name;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
        this.reorderQuantity = reorderQuantity;
        this.unitPrice = unitPrice;
        this.category = category;
        this.productRating = productRating;
    }
    
    
    
    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (this.productId != null ? this.productId.hashCode() : 0);
        
        return hash;
    }

    
    
    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Product)) 
        {
            return false;
        }
        
        Product other = (Product) object;
        
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) 
        {
            return false;
        }
        
        return true;
    }

    
    
    @Override
    public String toString() 
    {
        return "entity.Product[ productId=" + this.productId + " ]";
    }

    
    
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
    
    public Integer getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(Integer reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getProductRating() {
        return productRating;
    }

    public void setProductRating(Integer productRating) {
        this.productRating = productRating;
    }
}