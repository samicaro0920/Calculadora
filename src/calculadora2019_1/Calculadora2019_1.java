/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2019_1;

/**
 *
 * @author Sandra Cañas
 */
public class Calculadora2019_1 {
    private int ans;
    public Calculadora2019_1(){
        ans=0;
    }
    
    public int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int adicionar(int v){
        ans=ans+v;
        return ans;
    }
    
    public int sustraer(int v){
        ans=ans-v;
        return ans;
    }
    
    public int devolver_ans(){
        return ans;
    }
    
    public void clear(){
        ans=0;
    }
    
    public int dividir(int a, int b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans=a/b;
        return ans;
    }
}
