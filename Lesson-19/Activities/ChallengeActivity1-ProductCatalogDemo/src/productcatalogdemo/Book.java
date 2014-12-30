package productcatalogdemo;

public class Book extends Product {
    
    private String isbn;
    private int pages;
    
    public Book(String name, double price, String isbn, int pages) {
        super (name, price);
        this.isbn = isbn;
        this.pages = pages;
    }
    
    public String getIsbn() {
        return this.isbn;
    }
    
    public String setIsbn( String isbn) {
        return (this.isbn = isbn);
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int setPages(int pages) {
        return (this.pages = pages);
    }
                 
    @Override
    public String getType() {
        return "Book";
    }
    
}
