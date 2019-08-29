package com.iait.conversor.tasas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        LOG.info("Iniciando la aplicación...");

        App app = new App();
        app.run();
    }

    @Override
    public void run() {
        System.out.println("Hola mundo!");
    }
}
