package com.javaex.ex02;

import java.util.List;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDao bookDao = new BookDao();
		
		
		List<BookVo> bookList = bookDao.bookSelect();
		for(int i=0; i<bookList.size(); i++) {
			
			
			BookVo bookVo = bookList.get(i);
			System.out.println(bookVo.getBookId() + ", " + 
			                   bookVo.getTitle() + ", " +
					           bookVo.getPubs() + ", " +
			                   bookVo.getPubDate() + ", " +
			                   bookVo.getAuthorName());
			
		
		
			/*
			System.out.println(authorList.get(i).getAuthorId() + ", " + 
					           authorList.get(i).getAuthorName() + ", " + 
					           authorList.get(i).getAuthorDesc());
			*/
		}
		
	}

}
