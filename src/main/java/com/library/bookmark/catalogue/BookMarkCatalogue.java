package com.library.bookmark.catalogue;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * BookMarkCatalogue is the bootstrap of the application.
 * 
 * @author lokesh
 */
@SpringBootApplication
public class BookMarkCatalogue {
	
	public static void main(String[] args)
    {
        SpringApplication.run(BookMarkCatalogue.class, args);
    }
	
	@Bean
    public ModelMapper modelMapper()
    {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}
