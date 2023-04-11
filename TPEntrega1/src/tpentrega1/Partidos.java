/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpentrega1;

/**
 *
 * @author grupo6
 */
class Partidos {
private String codigo;
private String equipo1;
private String equipo2;
private int golesEquipo1;
private int golesEquipo2;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
 public Resultados.ResultadosEnum decidirResultado (int golesA, int golesB) {
  Resultados.ResultadosEnum resultados;
     if (golesA > golesB) {
     resultados = Resultados.ResultadosEnum.GANA_EQUIPO_1;}
     else if (golesA == golesB) {
     resultados = Resultados.ResultadosEnum.EMPATE; }
     else  {
             resultados = Resultados.ResultadosEnum.GANA_EQUIPO_2;}
    return resultados;
  }
 } 
