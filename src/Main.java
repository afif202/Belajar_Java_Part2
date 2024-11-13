 class Product {
     public static final double DOUBLE = 0.9;
     private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public void displayProduct() {
        // 10% discount
        calculateDiscount();
    }

     private void calculateDiscount() {
         System.out.println("Product Name: " + getName());
         System.out.println("Price: $" + getPrice());
         System.out.println("Discounted Price: $" + getPrice() * DOUBLE);
         System.out.println("Stock: " + getStock());
     }

     public void applyStockAdjustment(int adjustment) {
        setStock(getStock() + adjustment);
        System.out.println("Stock adjusted. New stock: " + getStock());
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public int getStock() {
         return stock;
     }

     public void setStock(int stock) {
         this.stock = stock;
     }
 }

 class Inventory {
    private Product product;
    private String location;

    public Inventory(Product product, String location) {
        this.setProduct(product);
        this.setLocation(location);
    }

    public void showInventory() {
        System.out.println("Location: " + getLocation());
        getProduct().displayProduct();
    }

     public Product getProduct() {
         return product;
     }

     public void setProduct(Product product) {
         this.product = product;
     }

     public String getLocation() {
         return location;
     }

     public void setLocation(String location) {
         this.location = location;
     }
 }

