package Funciones;

public class metodos {
    public double interes;
    
    
      public double sueldos(double men,double mes,double mesF,double gra){
        double ui ,suelF=0;
        double sueldoAnual=(men*(mesF-mes+1))+gra;     
        
        ui=sueldoAnual-(7*4300);
        if (ui<0){
           suelF=sueldoAnual;
           interes=0;
           }
        else{
            if (sueldoAnual <= 21500){
          suelF=sueldoAnual-(sueldoAnual*0.08);
          interes=0.08;
          
        } 
        else if (sueldoAnual >21500 && sueldoAnual<=86000)
        {
          suelF=sueldoAnual-(sueldoAnual*0.14);
          interes=0.14;
          
        }
        else if (sueldoAnual >86000 && sueldoAnual<=150500)
        {
           suelF=sueldoAnual-(sueldoAnual*0.17);
           interes=0.17;
           
        }
        else if (sueldoAnual>150500 && sueldoAnual<=193500)
        {
           suelF=sueldoAnual-(sueldoAnual*0.20);
           interes=0.20;
           
        }
        else {
           suelF=sueldoAnual-(sueldoAnual*0.30);
           interes=0.30;
             }
            
        }
        return suelF;
}
    
    
}
