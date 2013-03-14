/*
 * Copyright 2009 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.examples.bookstore.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.primefaces.examples.bookstore.domain.Book;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;

public class BookRepositoryJPA implements BookRepository {
	
	@Inject 
	Provider<EntityManager> em; 
	
	@Transactional
	public void createNew(Book book) {
		em.get().persist(book);
	}

	@SuppressWarnings("unchecked")
	public List<Book> findAll() {
		return em.get().createQuery("from Book").getResultList();
	}
}