package org.example.Handler;

public class RateLimitHandler implements RequestHandler{

    private RequestHandler requestHandler;

    @Override
    public void setNextHandler(RequestHandler next) {
        this.requestHandler=next;
    }

    @Override
    public void handle(Request request) {
        if(request.getRequestCount()>100){
            System.out.println("Request is rejected since Request Count has exceed 100");
            return;
        }
        System.out.println("Rate Limit Handler is Authorized!");
        if(requestHandler!=null){
            requestHandler.handle(request);
        }

    }
}
