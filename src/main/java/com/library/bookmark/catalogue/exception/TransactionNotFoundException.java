package com.library.bookmark.catalogue.exception;

/**
 * The Class TransactionNotFoundException.
 */
public class TransactionNotFoundException extends RuntimeException
{

    private static final long serialVersionUID = 8481549217064322365L;

    public TransactionNotFoundException(Integer number)
    {
        super("Transaction not found for number# : " + number);
    }

}
