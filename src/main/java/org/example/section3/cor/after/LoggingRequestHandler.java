package org.example.section3.cor.after;

import org.example.section3.cor.before.Request;

public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅완료!");
        super.handle(request);
    }
}
