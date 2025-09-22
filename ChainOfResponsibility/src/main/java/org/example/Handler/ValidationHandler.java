package org.example.Handler;

public class ValidationHandler implements RequestHandler{

    private RequestHandler requestHandler;

    @Override
    public void setNextHandler(RequestHandler next) {
        this.requestHandler=next;
    }

    @Override
    public void handle(Request request) {
        if(request.getPayLoad().isEmpty()){
            System.out.println("There is error in payload validation");
            return;
        }
        System.out.println("validation logic has been passed!");
        if(requestHandler!=null){
            requestHandler.handle(request);
        }
    }
}
