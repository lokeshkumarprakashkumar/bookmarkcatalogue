package com.library.bookmark.catalogue.entitiy;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

/**
 * Card entity to hold information of cards.
 * 
 * @author lprakash
 */
@Getter
@Setter
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class Card {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	private String title;

	private String description;

	private String url;

	private String shortUrl;
}
