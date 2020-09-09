package com.library.bookmark.catalogue.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.bookmark.catalogue.dto.CardDto;
import com.library.bookmark.catalogue.service.CardService;

/**
 * CardController to do CRUD operations on Card.
 * 
 * @author lprakash 
 */
@RestController
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@CrossOrigin
    @PostMapping("/cards")
    public ResponseEntity<Void> createAccount(@Valid @RequestBody CardDto cardDto)
    {
		cardService.createCard(cardDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	@CrossOrigin
    @GetMapping("/cards")
    public ResponseEntity<List<CardDto>> getTransactions()
    {
        List<CardDto> cards = cardService.getCards();
        return new ResponseEntity<>(cards, HttpStatus.OK);
    }
}
