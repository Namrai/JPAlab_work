package com.cg.batch.jpa.lab_work.Service;

import com.cg.batch.jpa.lab_work.Dao.AuthorDao;
import com.cg.batch.jpa.lab_work.Dao.AuthorImp;
import com.cg.batch.jpa.lab_work.entities.Author;

public class AuthorServiceImpl implements AuthorService {

	private AuthorDao dao;

	public AuthorServiceImpl() {
		dao = new AuthorImp();
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		try {
			dao.addAuthor(author);
			dao.commitTransaction();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public Author findAuthorById(int id) {
		Author author;
		author = dao.getAuthorByAuthorId(id);
		System.out.println("findEmployeeById in EmployeeServiceImpl");
		return author;
	}
}