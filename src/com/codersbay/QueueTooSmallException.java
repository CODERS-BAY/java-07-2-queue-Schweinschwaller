package com.codersbay;

public class QueueTooSmallException extends Exception {
    public QueueTooSmallException(String errorMessage) {
        super("QueueTooSmallException: " + errorMessage);
    }
}