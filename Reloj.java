public class Reloj
{
    private int horas;
    private int minutos;
    
    //constructor
    public Reloj(int HrsIni,int MinIni)
    {
        horas=HrsIni;
        minutos=MinIni;    
    }
    
    //metodos
    public void TicTac()
    {
        if (minutos <59)
        {
            minutos+=1;
        }
        else
        {  
            minutos=00;
        }
        if (minutos==0)
        {
            horas+=1;
        }
        if(horas==24)
        {
            horas=0;
        }
    }
    
    public String TuTiempoes()
    {
        String cadenaRes="";
        if(horas<10)
        {
            cadenaRes+="0";
        } 
        cadenaRes+=horas;
        cadenaRes+=":";
        if(minutos<10)
        {
            cadenaRes+="0";
        } 
        cadenaRes+=minutos;
        
          
        
        return cadenaRes;
    }

}