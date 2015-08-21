package edu;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class Spark {

    public static void main(String[] args) {

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Hola Mundo");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());

        post("/juego", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

//            String user = request.queryParams('usuario');
//            String texto = "";

//            if (user.equals('Daniel')) {
//
//            } else {
//
//            }

            model.put("inicioJuego", "iniciaste tu juego");
            return new ModelAndView(model, "juego.wm");
        }, new VelocityTemplateEngine());
    }

}
