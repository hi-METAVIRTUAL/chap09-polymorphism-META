package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.CookBook;

public class LibraryManager {










    public void insertMember(Member mem) {










    }

    public Member myInfo() {










    }

    public Book[] selectAll() {










    }

    public Book[] searchBook(String keyword) {
        Book[] book = new Book[5];
        int count = 0;
        for(int i=0; i<book.length; i++){
            if(bList[i].getTitle.contains(keyword)){
                book[count]=bList[i];
                count++;
            }
        }
        return book;
    }

    public int rentBook(int index) {










    }
}