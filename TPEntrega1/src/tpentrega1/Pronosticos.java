/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpentrega1;

/**
 *
 * @author grupo6
 */
class Pronosticos {
private String codigo;
private Resultados.ResultadosEnum resultado;
private int puntos;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Resultados.ResultadosEnum getResultado() {
        return resultado;
    }

    public void setResultado(Resultados.ResultadosEnum resultado) {
        this.resultado = resultado;
    }

    public int getPuntos() {
        return puntos;
    }


    
public void calculaPuntosPronostico (Resultados.ResultadosEnum pronostico, Resultados.ResultadosEnum real) {
if (pronostico == real) {
  puntos = 1;  }
else { puntos = 0;}
}

}        
    

