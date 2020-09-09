package com.library.bookmark.catalogue.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.bookmark.catalogue.entitiy.Card;

/**
 * ICardRepository to query card related info.
 * 
 * @author lprakash
 */
@Repository
public interface ICardRepository extends CrudRepository<Card, Long> {

}
