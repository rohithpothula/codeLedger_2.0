package org.example;

import org.example.Handler.*;
import org.example.caluculator.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubNumbers();
        Chain chain3 = new MultiplyNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        Numbers request = new Numbers(2,3,"mult");
//        here we call the chaining process
//        chain1.caluculate(request);


        RequestHandler authetication = new AuthenticationHandler();
        RequestHandler authorize = new AuthorizationHandler();
        RequestHandler ratelimit = new RateLimitHandler();
        RequestHandler validation = new ValidationHandler();

        authetication.setNextHandler(authorize);
        authorize.setNextHandler(ratelimit);
        ratelimit.setNextHandler(validation);

        Request request1 =  new Request("Rohith","ADMIN",99,"{'isActive':'true'}");

        authetication.handle(request1);

    }
}