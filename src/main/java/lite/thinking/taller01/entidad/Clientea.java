package lite.thinking.taller01.entidad;


import lombok.Data;
import lombok.NoArgsConstructor;

// import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// import javax.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

@Data
// @NoArgsConstructor
// @AllArgsConstructor
// Class
public class Clientea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idcliente ;


    String nombre ;
    String categoria ;


    public Integer getIdcliente() {
        return idcliente;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }

    public Clientea() {

    }

    public Clientea(Integer idcliente, String nombre, String categoria) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.categoria = categoria;
    }
/*
    public Clientea( String nombre, String categoria) {
       // this.idcliente = idcliente;
        this.nombre = nombre;
        this.categoria = categoria;
    }
*/


}
