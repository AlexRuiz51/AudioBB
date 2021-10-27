package edu.temple.audiobb

data class Book(var title: String, var author: String)

object Supplier {
    val books = listOf<Book>(
        Book("Don Quixote", "Miguel de Cervantes"),
        Book("And Then There Were None", "Agatha Christie"),
        Book("Alice's Adventures in Wonderland", "Lewis Carroll"),
        Book("Catcher in the Rye", "J.D. Salinger"),
        Book("The Lion, the Witch, and the Wardrobe", "C.S. Lewis"),
        Book("Pinocchio", "Carlo Collodi"),
        Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
        Book("Lord of the Rings", "J.R.R. Tolkien"),
        Book("War and Peace", "Leo Tolstoy"),
        Book("The Great Gatsby", "F. Scott Fitzgerald")

    )
}