package com.hw1.controller;

import com.hw1.model.dto.Book;

public class LibraryManager {



    public void insertMember(Member mem(){















    }

    public Member myInfo(){















    }

    public Book selectAll(){















    }

    public book[] searchBook(String keyword){















    }

    public int rentBook(int index) {
        int result = 0;
        Book[] blist = new Book[index];

        if (blist[index].this.AccessAge() < 19){
            result = 1;
        }else if (blist[index].this.Coupon() == true){

            result = 2;

        }

        return  result;
    }




}
