package org.example.section3.cor.after;

import org.example.section3.cor.before.Request;

public class AuthRequestHandler extends RequestHandler{
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 되었는가?");
        super.handle(request);
    }
}
