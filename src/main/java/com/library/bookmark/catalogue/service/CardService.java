package com.library.bookmark.catalogue.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.bookmark.catalogue.dto.CardDto;
import com.library.bookmark.catalogue.entitiy.Card;
import com.library.bookmark.catalogue.repository.ICardRepository;

/**
 * CardService to provide hold card related service methods.
 * 
 * @author lprakash
 */
@Component
public class CardService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ICardRepository cardRepo;

	@Transactional
	public Card createCard(CardDto cardDto) {
		return cardRepo.save(modelMapper.map(cardDto, Card.class));
	}
	
	@Transactional
	public List<CardDto> getCards() {
		List<CardDto> cards = new ArrayList<>();
		cardRepo.findAll().forEach(card -> cards.add(modelMapper.map(card, CardDto.class)));
		return cards;
	}
}
