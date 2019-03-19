package com.w.impl;

import com.w.service.IBookService;


public class BookServiceImpl implements IBookService {
    @Override
    public String getBooks(String name) {

        return "Hello"+name;
    }
}
