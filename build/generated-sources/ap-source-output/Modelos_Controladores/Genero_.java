package Modelos_Controladores;

import Modelos_Controladores.Alumno;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-02-22T07:21:28")
@StaticMetamodel(Genero.class)
public class Genero_ { 

    public static volatile SingularAttribute<Genero, String> descripcion;
    public static volatile CollectionAttribute<Genero, Alumno> alumnoCollection;
    public static volatile SingularAttribute<Genero, Integer> idgenero;

}