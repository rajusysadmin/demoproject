package conf;

import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.ApplicationController;

public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {  
        router.GET().route("/").with(ApplicationController.class, "index");
        router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");
        router.GET().route("/.*").with(ApplicationController.class, "index");
    }
}
