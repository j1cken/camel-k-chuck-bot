package com.redhat;

import org.apache.camel.main.Main;

// @SpringBootApplication
public class Application {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.addRouteBuilder(new Routes());
        main.run(args);
    }

}