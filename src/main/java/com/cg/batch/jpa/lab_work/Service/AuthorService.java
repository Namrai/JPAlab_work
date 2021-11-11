package com.cg.batch.jpa.lab_work.Service;

import com.cg.batch.jpa.lab_work.entities.Author;

public interface AuthorService {
	public abstract void addAuthor(Author author);
	public abstract void updateAuthor(Author author);
	public abstract void removeAuthor(Author author);
	public abstract Author findAuthorById(int id);
}

