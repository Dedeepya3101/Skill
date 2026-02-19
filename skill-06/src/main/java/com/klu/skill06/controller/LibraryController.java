package com.klu.skill06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.skill06.model.Book;
import com.klu.skill06.service.LibraryService;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    // 1. Welcome Message
    @GetMapping("/welcome")
    public String welcome() {
        return libraryService.getWelcomeMessage();
    }

    // 2. Total Books Count
    @GetMapping("/count")
    public int countBooks() {
        return libraryService.getTotalBooks();
    }

    // 3. Sample Price
    @GetMapping("/price")
    public double getPrice() {
        return libraryService.getSamplePrice();
    }

    // 4. Get Book Titles
    @GetMapping("/books")
    public List<String> getBookTitles() {
        return libraryService.getBookTitles();
    }

    // 5. Get Book by ID (PathVariable)
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return libraryService.getBookById(id);
    }

    // 6. Search by Title (RequestParam)
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return libraryService.searchByTitle(title);
    }

    // 7. Author Name (PathVariable)
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return libraryService.getAuthorMessage(name);
    }

    // 8. Add Book (POST with RequestBody)
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    // 9. View All Books
    @GetMapping("/viewbooks")
    public List<Book> viewAllBooks() {
        return libraryService.getAllBooks();
    }
}
