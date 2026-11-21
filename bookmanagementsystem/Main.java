package bookmanagementsystem;

import java.util.*;
public class Main{
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        print();
    }//main

    public static void print(){
        Library library = new Library();
        boolean stopper = true;
        
        while(stopper){
        System.out.println("------------------------------------------");
        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        
        System.out.println("1. Add a book");
        System.out.println("2. Register a member");
        System.out.println("3. Display all books");
        System.out.println("4. Display All Members");
        System.out.println("5. Borrow a Book");
        System.out.println("6. Return a Book");
        System.out.println("7. Display Member's Borrowed Books");
        System.out.println("0. Exit");
        System.out.print("Select: ");
        int choice = input.nextInt();
        System.out.println("------------------------------------------");
        
        if(choice == 1){
            library.addBook();
        }
        
        else if (choice == 2){
            library.registerMember();
        }
        else if (choice == 3){
            library.displayAllBooks();
        }else if (choice == 4){
            library.displayAllMembers();
        }else if (choice == 5){
            library.borrowBook();
        }else if (choice == 2){
            
        }else if (choice == 7){
            library.displayBorrowedBooks();
        }else if (choice == 0){
            stopper = false;
        }
        
        
        
        }
    }
}

