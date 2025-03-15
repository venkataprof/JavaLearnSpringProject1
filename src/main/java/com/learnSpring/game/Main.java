package com.learnSpring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // without beans
//        var game = new PacmanGame();
//
//        var gameRunner = new GameRunner(game);
//
//        gameRunner.run();

        // with beans

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }
}
