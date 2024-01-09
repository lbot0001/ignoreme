package br.com.lbot.ignoreme.exception;

public class ItemNotFoundException extends RuntimeException {

    private Long id;

    public ItemNotFoundException(String id) {
        super("Could not find item " + id);
    }
}