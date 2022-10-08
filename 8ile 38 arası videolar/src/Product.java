public class Product extends ArraysDemo {
    public Product(){
        yaz("yapıcı blok çalişti");
        this.id=id;
        this.renk=renk;
        this.price=price;
        this.name=name;
        this.description=description;
        this.stockAmount=stockAmount;
    }
    int id;

    private String name;
    private String description;
    private double price;
    private String renk;
    private String kod;
    private int stockAmount;



    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}



/*
 public static void main(String[] args) {
      // Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"siyah");
       Product product=new Product();
        product.setName("laptop");
       product.setId(1);
       product.setDescription("Asus Laptop");
       product.setPrice(5000);
       product.setStockAmount(3);
         yaz(product.getName());
       ProductManager productManager=new ProductManager();
       productManager.Add(product);
       yaz(product.getKod());
    }
 */