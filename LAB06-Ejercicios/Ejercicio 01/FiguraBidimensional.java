/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Gabo
 */
public abstract class FiguraBidimensional implements Figura{
    
    public String tipoFiguraBi;
    public String tipoCuerpoBi;

    // -------------Constructor----------------------

    public FiguraBidimensional(String FiguraBi, String CuerpoBi){
        tipoFiguraBi = FiguraBi;
        tipoCuerpoBi = CuerpoBi;
    }

   // ----------------gets y sets ---------------------- 

    public String getTipoFiguraBi(){
        return tipoFiguraBi;
    }

    public String getTipoCuerpoBi(){
        return tipoCuerpoBi;
    }

    public void setTipoFiguraBi(String tipoFiguraBi){
        this.tipoFiguraBi = tipoFiguraBi;
    }

    public void setTipoCuerpoBi(String tipoCuerpoBi){
        this.tipoCuerpoBi = tipoCuerpoBi;
    }

}