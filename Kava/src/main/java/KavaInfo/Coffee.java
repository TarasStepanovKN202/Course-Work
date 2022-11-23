package KavaInfo;

import Commands.ProductsInBus;

public class Coffee extends ProductsInBus {
    public Coffee(int productid, int weight, String sort, String physstan, int pricekg, String packtype, int quantity, String company){
        this.productid=productid;
        this.weight=weight;
        this.sort=sort;
        this.physstan=physstan;
        this.pricekg=pricekg;
        this.packtype=packtype;
        this.quantity=quantity;
        this.company=company;
    }
    private int productid, weight, pricekg, quantity;
    private String sort, company,packtype,physstan;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPricekg() {
        return pricekg;
    }

    public void setPricekg(int pricekg) {
        this.pricekg = pricekg;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPacktype() {
        return packtype;
    }

    public void setPacktype(String packtype) {
        this.packtype = packtype;
    }

    public String getPhysstan() {
        return physstan;
    }

    public void setPhysstan(String physstan) {
        this.physstan = physstan;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "productid=" + productid +
                ", weight=" + weight +
                ", pricekg=" + pricekg +
                ", quantity=" + quantity +
                ", sort='" + sort + '\'' +
                ", company='" + company + '\'' +
                ", Packtype=" + packtype +
                ", PhysStan=" + physstan +
                '}';
    }
}

