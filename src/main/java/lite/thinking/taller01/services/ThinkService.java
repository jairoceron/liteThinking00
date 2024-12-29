package lite.thinking.taller01.services;

import lite.thinking.taller01.entidad.Clientea;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Annotation
@Service
public class ThinkService {


    public String primerServicio(String pais) {


        if (pais.equals("25")) {
            return "Francia .... ";
        }
        return "Argentina";
    }

    public List<Clientea> creacionColeccion() {

         List<Clientea> lc = new ArrayList<>();
        Clientea cl1 = new Clientea(8856, "Pedro", "Premium");
        lc.add(cl1);
         cl1 = new Clientea(88526, "Luis", "Premium");
         lc.add(cl1);
         cl1 = new Clientea(8856, "Carlos", "Premium");
        lc.add(cl1);


        return lc;
    }

}
