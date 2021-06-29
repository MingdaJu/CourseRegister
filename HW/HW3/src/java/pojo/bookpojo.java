/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author jumin
 */
public class bookpojo {
    private String id;
    private String isbn;
    private String title;
    private String author;
    private String price;

    public bookpojo(String id,String isbn, String title, String author, String price) {
        this.id=id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public bookpojo(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
