package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import java.util.Scanner;


public class LibraryMenu {

    private LibraryManager lm = null;
    Scanner sc = null;
    public void mainMenu() {
        do {
            System.out.println("====== Library Management System ======");
            System.out.println("도서 대여 관리 프로그램에 접속하셨습니다.");
            System.out.println("=======================================");
            System.out.println("1. 마이페이지 관리");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료");
            System.out.println("====================================");
            System.out.println("원하는 관리 메뉴의 번호를 입력해 주세요 : ");

            sc = new Scanner(System.in);
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1: lm.myInfo(); break;
                case 2: lm.selectAll(); break;
                case 3: lm.searchBook(); break;
                case 4: lm.rentBook(); break;
                case 0: System.out.println("프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 번호입니다. 다시 입력해 주세요."); break;
            }

        } while (true);
    }

    public void selectAll (Book[] bList) {

        bList = lm.selectAll();


        for(int i = 0; i < bList.length; i++) {
            System.out.println(bList[i] + "번도서" + i);
        }
    }


    public void searchBook () {
        sc = new Scanner(System.in);
        System.out.println("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);


        for (Book book : searchList) {
            System.out.println(book);
        }
    }


    public void rentBook () {
        selectAll();
        sc = new Scanner(System.in);
        String message = "";
        System.out.println("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        LibraryManager li = new LibraryManager();
        int result = li.rentBook(index);
        switch (result) {
            case 0: message = "성공적으로 대여 했습니다."; break;
            case 1: message = "나이 제한으로 대여 불가능입니다."; break;
            case 2: message = "성공적으로 대여되었습니다. 요리학원 쿠폰이 빌급 되었습니다. \n " +
                            "마이페이지를 통해 확인하세요"; break;
        }
        System.out.println(message);
    }

}

