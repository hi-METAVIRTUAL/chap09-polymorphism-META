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
        if (blist[index].getAccessAge() < 19){
            result = 1;
        }else if (blist[index].getCoupon() == true){

            result = 2;
            blist[index].setCoupon(+1);
        }

        return  result;
    }




}
