package com.library.bookmark.catalogue.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CardDto to pass card info.
 * 
 * @author lprakash
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDto {
	
	@NotNull(message = "Title should not be null")
	private String title;
	
	@NotNull(message = "Description should not be null")
	private String description;
	
	@NotNull(message = "url should not be null")
	private String url;

	private String shortUrl;
}
