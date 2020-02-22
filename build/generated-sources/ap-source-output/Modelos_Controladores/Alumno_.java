package Modelos_Controladores;

import Modelos_Controladores.Genero;
import Modelos_Controladores.Inscripcion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-02-22T07:21:28")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Integer> numeroCarne;
    public static volatile SingularAttribute<Alumno, String> apellido;
    public static volatile SingularAttribute<Alumno, String> correo;
    public static volatile SingularAttribute<Alumno, Genero> generoIdgenero;
    public static volatile SingularAttribute<Alumno, String> direccion;
    public static volatile SingularAttribute<Alumno, String> telefono;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile CollectionAttribute<Alumno, Inscripcion> inscripcionCollection;

}