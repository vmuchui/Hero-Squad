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

    get("/", (request,response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());
    get("/new", (request,response)-> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());

    post("/new", (request,response)-> {
     
      Map<String, Object> model = new HashMap<String, Object>();
      
      String name = request.queryParams("name");
      int size = Integer.parseInt(request.queryParams("size"));
      String cause = request.queryParams("cause");
      Squad newSquad = new Squad(name,size,cause);
     
      
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    
  }
}