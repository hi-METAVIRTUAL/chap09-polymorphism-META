package com.hw1.view;

import com.hw1.controller.LibraryManager;

import java.util.Scanner;

public class LibraryMenu {










    public void mainMenu() {










    }

    public void selectAll(){










    }

    public void searchBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        LibraryManager.searchBook(keyword);

        Book[] searchList = lm.searchBook(keyword);

        for(List books : searchList){
            System.out.println(books);
        }
    }

    public void rentBook(){










    }

}
