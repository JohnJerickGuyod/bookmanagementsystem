package bookmanagementsystem;

public class Book {
       int bookId;
       String title;
       String author;
       boolean isAvailable;
       
       public Book(int bookId,String title,String author){
           this.bookId = bookId;
           this.title = title;
           this.author = author;
           this.isAvailable = true;
       }
      
       
       public boolean borrowBook(){
           return this.isAvailable = false;
       }
       public boolean returnBook(){
           return this.isAvailable = true;
       }
       
       
       public void displayBookInfo(){
           System.out.println("Book ID : " + this.bookId);
           System.out.println("Book ID : " + this.title);
           System.out.println("Book ID : " + this.author);
           System.out.println("Book ID : " + this.isAvailable);
       }
}
