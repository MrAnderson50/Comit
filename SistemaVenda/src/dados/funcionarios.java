/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Mr Anderson
 */
public class funcionarios {
    
    private int codigo;
    private String nome;
    private String end;
    private double cpf;
    private double tel;
    
    private static int contadorCodigo = 1;
    
    public funcionarios (){
        System.out.println ("Construtor default de Produto");
        
        codigo = contadorCodigo;
        contadorCodigo++;
        
        
    }
            
    public funcionarios (String nome,
                        String end,
                        double cpf,
                        double tel ) {
        codigo = contadorCodigo; 
        contadorCodigo++;
        System.out.println("Construtor de agumento ");
        
        this.nome = nome;
        this.end = end;
        this.cpf = cpf;
        this.tel = tel;
         
    }      
    
    public void imprimirDados () {
        System.out.println(toString() );
    }
    @Override 
    
    public String toString (){
        
        String relatorio = "";
        relatorio += "Códio: " +codigo;
        relatorio += "/nNome: "+nome;
        relatorio += "/nEndereço: "+end;
        relatorio += "/nCpf: "+cpf;
        relatorio += "/nTelefone: "+tel;
        return relatorio;
        
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
 }
    public void setNome(String nome ){
        this.nome = nome;
       
    }
    public String getEnd (){
        return end;
    }
    public void setEnd (String end){
        this.end = end;
    }
    public double getCpf (){
        return cpf;
        
    }
    public void setCpf(double Cpf){
        this.cpf = cpf;
    }
    public double getTel(){
        return tel;
    }
    public void setTel(double Tel){
        this.tel = tel;
        
    }
    
   
   
    
}
