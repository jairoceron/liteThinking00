package lite.thinking.taller01.controller;


import lite.thinking.taller01.entidad.Clientea;
import lite.thinking.taller01.services.ServicioCliente;
import lite.thinking.taller01.services.ThinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThinkController {

    private final ThinkService thinkService;
    public ThinkController (ThinkService personService){
        this.thinkService = personService;
    }


    @GetMapping("/api/liteThinking/{parametro1}")
    @ResponseBody
    public String controlador1(@PathVariable String parametro1 ) {

         String retorno = thinkService.primerServicio(parametro1);
         return "Ejemplo 1 del controlador .... " + retorno;
    }

    @GetMapping("/api/invocarColeccion")
    @ResponseBody
    public List<Clientea> invocarColeccion( ) {

        List<Clientea> retorno = thinkService.creacionColeccion();
        return  retorno;
    }
}
