/**
 *Representa la estructura básica de figuras geométricas.
 *Las subclases deben implementar los métodos para calcular el área y el perímetro.
 *
 *@author Agustin_Canterla
 */
public abstract class Figura {

    /**
     *Retorna el área de la figura.
     *
     *@return Área como double
     */	
    public abstract double area();
    
    /**
     *Retorna el perímetro de la figura.
     *
     *@return Perímetro como double
     */
    public abstract double perimetro();
}

