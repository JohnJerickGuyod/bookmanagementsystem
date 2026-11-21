package bookmanagementsystem;

public class Member extends Person{
    
    int borrowedCount = 0;
    Book[] borrowedBooks = new Book[3];
    int memberId;

    public Member(){
        super("none",0);
    }
    
    public Member(int memberId,String name, int age){
        super(name,age);
        this.memberId = memberId; 
    }
    public void borrowBook(Book book){
        if(borrowedCount < 3 && book.isAvailable){
            this.borrowedBooks[this.borrowedCount] = book;
            book.borrowBook();
            borrowedCount++;
            System.out.println("borrow success");
        }
        else{
            System.out.println("Cannot borrow book");
        }
    }
    
    public void returnBook(Book book){
        
        if(book.isAvailable = false){
            book.isAvailable = true;
            if (borrowedCount > 3) {
                borrowedCount = 3;
            }
        }
        else{
            System.out.println("Cant return the book, its available");
        }
        
        
    }
    public void displayMemberBorrowedBooks(){
        for (Book book : borrowedBooks) {
            System.out.println("------------------------------------------");
            displayInfo();
            System.out.println(book.bookId);
            System.out.println(book.title);
            System.out.println(book.author);
            System.out.println("------------------------------------------");
        }
    }
}
