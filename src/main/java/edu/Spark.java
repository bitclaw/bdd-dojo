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
            model.put("message", "Mortal Kombat");
            return new ModelAndView(model, "mortal-kombat-start.wm");
        }, new VelocityTemplateEngine());

        post("/select-player", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

//            String user = request.queryParams('usuario');
//            String texto = "";

//            if (user.equals('Daniel')) {
//
//            } else {
//
//            }

            model.put("message", "Select player");
            return new ModelAndView(model, "select-player.wm");
        }, new VelocityTemplateEngine());
    }

}
