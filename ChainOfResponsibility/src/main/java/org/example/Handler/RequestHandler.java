package org.example.Handler;

public interface RequestHandler {
    public void setNextHandler(RequestHandler next);
    public void handle(Request request);
}
