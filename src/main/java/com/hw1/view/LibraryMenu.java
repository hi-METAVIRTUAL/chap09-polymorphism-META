package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;

import java.util.Scanner;

public class LibraryMenu {



    public void mainMenu() {















    }

    public void selectAll(){















    }

    public void searchBook() {







  







    }

    public void rentBook(){
        Scanner sc= new Scanner(System.in);
        selectAll();
        String message = "";
        System.out.println("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        LibraryManager li = new LibraryManager();
        int result = li.rentBook(index);
        switch (result){
            case 0 : message = "성공적으로 대여 했습니다.";break;
            case 1 : message = "나이 제한으로 대여 불가능입니다.";break;
            case 2 : message = "성공적으로 대여되었습니다. 요리학원 쿠폰이 빌급 되었습니다. \n " +
                    "마이페이지를 통해 확인하세요"; break;
        }



    }

}
