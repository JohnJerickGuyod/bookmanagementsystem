package bookmanagementsystem;

import java.util.*;
public class Library {
    static Scanner input = new Scanner(System.in);
    public Book[] books = new Book[100];
    public Member[] members = new Member[50];
    Member membersInfo;
    public int booksCounter = 0;
    public int membersCounter = 0;
    
    public void addBook(){
        System.out.print("Book ID: ");
        int bookID = input.nextInt();
        
        System.out.print("Book title: ");
        String bookTitle = input.next();
        
        System.out.print("Book author: ");
        String bookAuthor = input.next();
        
        this.books[this.booksCounter] = new Book(bookID,bookTitle,bookAuthor);
        booksCounter++;
        
        System.out.println("Book " + bookID +" is successfully added");
    }
    public void registerMember(){
        System.out.print("Enter Member ID: ");
        int memberID = input.nextInt();
        
        System.out.print("Name: ");
        String memberName = input.next();
        
        System.out.print("Age: ");
        int memberAge = input.nextInt();

        this.members[this.membersCounter] = new Member(memberID,memberName,memberAge);
        membersCounter++;
        
        System.out.println("SUCCESS");
    }
    
    public void displayAllBooks(){
        for(int i = 0; i < this.booksCounter;i++ ){
            Book book = books[i];
            System.out.println("------------------------------------------");
            System.out.println("Book: " + (i+1));
            System.out.println("Book ID: " + book.bookId);
            System.out.println("Book title: " + book.title);
            System.out.println("Book author: " + book.author);
            System.out.println("Book availability: " + book.isAvailable);
            System.out.println("------------------------------------------");
        }
    }
    
    public void displayAllMembers(){
        for(int i = 0; i < this.membersCounter; i++){
            Member member = members[i];
            System.out.println("------------------------------------------");
            System.out.println("Member ID: "+ member.memberId);
            System.out.println("Member name: "+ member.name);
            System.out.println("Member age: "+ member.age);
            System.out.println("------------------------------------------");
        }
    }
    public void borrowBook(){
        Book foundBook = null;
        Member foundMember = null;

        System.out.println("------------------------------------------");
        System.out.print("Enter Book ID: ");
        int bookID = input.nextInt();
        System.out.print("Enter member ID: ");
        int memberID = input.nextInt();
        System.out.println("------------------------------------------");

        for (int i = 0; i < booksCounter; i++) {
            Book book = books[i];
            if (bookID == book.bookId) {
                foundBook = book;
            }
        }
        for (int i = 0; i < membersCounter; i++) {
            Member member = members[i];
            if (memberID == member.memberId) {
                foundMember = member;
            }
        }
        
        if (foundMember == null){
            borrowBook();
        }
        if (foundMember == null) {
            borrowBook();
        }
        foundMember.borrowBook(foundBook);
        
       

    }
    public void returnBook(){
        
    }
    public void displayBorrowedBooks(){
        membersInfo.displayMemberBorrowedBooks();
    }
}
