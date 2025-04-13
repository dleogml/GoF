package org.example.section2.proxy.java;

import org.example.section2.proxy.after.DefaultGameService;
import org.example.section2.proxy.after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {
    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("Hello dynamic proxy");
                    method.invoke(target, args);
                    System.out.println("Goodbye dynamic proxy");
                    return null;
                });
    }
}
