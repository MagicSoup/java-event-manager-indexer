package com.event.manager.indexer.domain.exception;

public class IndexerException extends Exception {

    public IndexerException(String message) {
        super(message);
    }

    public IndexerException(String message, Throwable cause) {
        super(message, cause);
    }
}
