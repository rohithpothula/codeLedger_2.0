package org.example.Handler;

public class AuthenticationHandler implements RequestHandler{

    private RequestHandler requestHandler;

    @Override
    public void setNextHandler(RequestHandler next) {
        this.requestHandler=next;
    }

    @Override
    public void handle(Request request) {
        if(request.getUser().equals(null)){
            System.out.println("The user is not authenticated");
            return;
        }
        if(requestHandler!=null)
            requestHandler.handle(request);
    }
}
