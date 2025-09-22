package org.example.Handler;

public class AuthorizationHandler implements RequestHandler{

    private RequestHandler requestHandler;
    @Override
    public void setNextHandler(RequestHandler next) {
        this.requestHandler=next;
    }

    @Override
    public void handle(Request request) {
        if(request.getUserRole().equals("!ADMIN")){
            System.out.println("The user is not authorized to use the resource");
            return ;
        }
        System.out.println("Authorization Handler is authorized");
        if(requestHandler!=null)
            requestHandler.handle(request);
    }
}

