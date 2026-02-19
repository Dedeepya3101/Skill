package com.klu.skill06.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.skill06.model.Book;

@Service
public class LibraryServiceImpl implements LibraryService {

    private List<Book> bookList = new ArrayList<>();

    public LibraryServiceImpl() {
        // Initial sample books
        bookList.add(new Book(1, "Java Basics", "James Gosling", 499.0));
        bookList.add(new Book(2, "Spring Boot Guide", "Rod Johnson", 599.0));
        bookList.add(new Book(3, "Data Structures", "Mark Allen", 399.0));
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the Online Library System!";
    }

    @Override
    public int getTotalBooks() {
        return bookList.size();
    }

    @Override
    public double getSamplePrice() {
        return 499.99;
    }

    @Override
    public List<String> getBookTitles() {
        List<String> titles = new ArrayList<>();
        for (Book book : bookList) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Book getBookById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String searchByTitle(String title) {
        return "You searched for book with title: " + title;
    }

    @Override
    public String getAuthorMessage(String name) {
        return "Books written by author: " + name;
    }

    @Override
    public String addBook(Book book) {
        bookList.add(book);
        return "Book added successfully!";
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }
}
