import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;




public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    ProcessBuilder process = new ProcessBuilder();
     Integer port;
     if (process.environment().get("PORT") != null) {
         port = Integer.parseInt(process.environment().get("PORT"));
     } else {
         port = 4567;
     }

    setPort(port);

    get("/", (request,response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());
    get("/squads/new", (request,response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/squad-form.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());

    
    post("/news", (request, response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Squad> squads = request.session().attribute("squads");
      if(squads == null) {
        squads = new ArrayList<Squad>();
        request.session().attribute("squads", squads);
      }

      String name = request.queryParams("name");
      int size = Integer.parseInt(request.queryParams("size"));
      String cause = request.queryParams("cause");

      Squad newSquad = new Squad(name, size, cause);
      squads.add(newSquad);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    get("/squads", (request, response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("squads", request.session().attribute("squads"));
      model.put("template", "templates/squads.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());
    get("/news", (request, response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());
    get("/heroes/new", (request,response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/newhero.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());
    get("/newhero", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/herosuccess.vtl");      
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    post("/newhero", (request, response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Hero> heroes = request.session().attribute("heroes");
      if(heroes== null) {
        heroes = new ArrayList<Hero>();
        request.session().attribute("heroes", heroes);
      }

      String name = request.queryParams("hName");
      int age = Integer.parseInt(request.queryParams("age"));
      String weakness = request.queryParams("weakness");
      String strength = request.queryParams("strength");
      Hero newHero = new Hero(name, age, weakness, strength);

      heroes.add(newHero);
      
      model.put("template", "templates/herosuccess.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    get("/heroes", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("heroes", request.session().attribute("heroes"));
      model.put("template", "templates/hero.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}