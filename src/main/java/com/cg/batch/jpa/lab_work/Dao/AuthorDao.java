package com.cg.batch.jpa.lab_work.Dao;

import javax.persistence.EntityExistsException;

import com.cg.batch.jpa.lab_work.entities.Author;


public interface AuthorDao
{
	public abstract Author getAuthorByAuthorId(int id);
	public abstract void addAuthor(Author author) throws EntityExistsException;
	public abstract void removeAuthor(Author author);
	public abstract void updateAuthor(Author author);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}