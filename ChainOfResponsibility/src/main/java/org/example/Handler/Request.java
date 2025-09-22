package org.example.Handler;

public class Request {
    private String user;
    private String userRole;
    private int requestCount;
    private String payLoad;

    public Request(String user,String userRole,int requestCount,String payLoad){
        this.user=user;
        this.userRole=userRole;
        this.requestCount=requestCount;
        this.payLoad=payLoad;
    }

    public String getPayLoad() {
        return payLoad;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public String getUser() {
        return user;
    }

    public String getUserRole() {
        return userRole;
    }
}
