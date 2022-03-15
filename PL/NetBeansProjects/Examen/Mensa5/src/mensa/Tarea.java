/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensa;

/**
 *
 * @author quevedo
 */
public abstract class Tarea implements SincroForeBack{

    // Información que debe ser indicada a la clase
    private boolean Seguro;
    private int PagoAplazado; // Aplazamiento en meses. -1 indica que no hay aplazamiento 
    private boolean Participa;
    private int numero;
    // Constrctor
    Tarea(){
        Seguro=false;
        PagoAplazado=-1;
    }
    
    public void setSeguro(boolean Seguro){
        this.Seguro=Seguro;
    }
    
    public void setPagoApazado(int PagoAplazado){
        this.PagoAplazado=PagoAplazado;
    }

    public boolean isParticipa() {
        return Participa;
    }

    public void setParticipa(boolean Participa) {
        this.Participa = Participa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
      
    
    
    // Lanzar la tarea
    public void Run(){
        Start();
        
        // Tarjeta
        float Importe=40;
        DetalleDeImporte("Tarifa 40€");
        DetalleDeCalculo("Comprobando tarjeta");
        InicioCalculo();
        for(int i=0;i<10;i++){
            Duerme(0.25F);
            ProporcionCalculo((i+1)/10F);
            DetalleDeCalculo(" Condición "+(char)((int)'A'+i)+" OK");
            if(Stop()) return;
        }
        FinCalculo();
        DetalleDeCalculo("Tarjeta OK");
        DetalleDeImporte("Tarjeta 5€");
        Importe=Importe+5;
        
        // Seguro
        if(Seguro){
            DetalleDeCalculo("Buscando el mejor seguro");
            InicioCalculo();
            for(int i=0;i<5;i++){
                Duerme(0.5F);
                ProporcionCalculo((i+1)/5F);
                DetalleDeCalculo(" Seguro "+(char)((int)'A'+i)+" "+(2+i)+"€");
                if(Stop()) return;
            }
            FinCalculo();            
            DetalleDeCalculo("Seguro más barato: 2€");
            DetalleDeImporte("Seguro 2€");
            Importe=Importe+2;
        } // fin Seguro
        
        if(PagoAplazado>0){
            float CostePlazos=0;
            DetalleDeCalculo("calculando coste de cada mes");
            InicioCalculo();
            for(int i=0;i<PagoAplazado;i++){
                Duerme(0.5F);
                ProporcionCalculo((i+1.0F)/PagoAplazado);
                DetalleDeCalculo(" Mes "+(i+1)+" 0.5€");
                CostePlazos=CostePlazos+0.5F;
                if(Stop()) return;
            }
            FinCalculo();            
            DetalleDeCalculo("Total coste aplazamiento: "+CostePlazos+"€");
            DetalleDeImporte("Coste aplazamiento: "+CostePlazos+"€");
            Importe=Importe+CostePlazos;
        } // Fin Pago Aplazado
        
        if(Participa){
            int aciertos=0;
            DetalleDeCalculo("Obteniendo resultados del sorteo...");
            for(int i = 1; i<=3;i++){
                
                Duerme(0.5F);
                int val=(int)(Math.random()*10);
                DetalleDeCalculo(String.format("Bola %d: %d", i, val));
                if(numero==val) {
                    aciertos++;
                    DetalleDeCalculo("¡Premio!");
                    AvisoPremio(i);
                } else {
                    DetalleDeCalculo("Sin premio...");
                }
            }
            
            float descuento=0;
            switch (aciertos){
                case 1: descuento=(float) 0.2;
                    break;
                case 2: descuento=(float) 0.5;
                    break;
                case 3: descuento=(float) 1;
                    break;
            }
            DetalleDeImporte(String.format("Descuento del sorteo: %.1f€", Importe*descuento));
            Importe=Importe - (Importe*descuento);
        }
        DetalleDeImporte(String.format("Importe total: %.1f€", Importe));
        Finish(Importe);
    }
            
    // Métodos llamados por Run
    private void Duerme(float SegsIte)
    {
        try
        {
            Thread.sleep((int)(SegsIte*1000));
        }
        catch(java.lang.InterruptedException E){}
    }     
}
