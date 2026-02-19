package com.klu.skill06.service;

import java.util.List;
import com.klu.skill06.model.Book;

public interface LibraryService {

    String getWelcomeMessage();

    int getTotalBooks();

    double getSamplePrice();

    List<String> getBookTitles();

    Book getBookById(int id);

    String searchByTitle(String title);

    String getAuthorMessage(String name);

    String addBook(Book book);

    List<Book> getAllBooks();
}
