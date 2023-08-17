package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;


public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }


/*    public void insertMember(Member mem) {



    }*/

    public Member myInfo() {

        System.out.println("=========내 회원 정보=================");
        return mem;
    }


    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {

        Book[] searchList = new Book[5];
        if(bList.con) {
        }

        return searchList1;
    }

    public int rentBook(int index) {
        int result = 0;
        Book[] blist = new Book[index];
        /*if (blist[index].getAccessAge() < 19){
            result = 1;
        }else if (blist[index].getCoupon() == true){

            result = 2;
            blist[index].setCoupon(+1);
        }*/

        return  result;
    }




    }
}