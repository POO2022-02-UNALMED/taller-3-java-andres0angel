package televisores;

public class TV {
    //marca (Marca), canal(int), precio(int), estado(boolean), volumen(int) y control (Control).
    //Por defecto el valor de los atributos canal, volumen y precio serán: 1, 1 y 500
    //Tendrá los métodos set y get para los atributos marca, control, precio, volumen y canal.
    public static int numTV = 0;
    Marca marca;
    int canal = 1;
    int precio= 500;
    boolean estado;
    int volumen =1;
    Control control;
    
    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
    }
    
    public Marca getMarca(){
        return marca;
    }
    
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    
    public void setControl(Control control){
        this.control = control;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    
    public int getPrecio (){
        return precio;
    }
    
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setCanal(int canal){
        this.canal=canal;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void contadorTV(TV tv){
        if (tv.marca == this.marca && tv.canal == this.canal && tv.precio==this.precio && tv.estado==this.estado
        && tv.volumen == this.volumen && tv.control==this.control){
            numTV += 1;
        }
    }
    
    public int getNumTV(){
        return numTV;
    }
    
    //llamados turnOn y turnOff
    public void turnOn(){
        this.estado=true;
    }
    
    public void turnOff (){
        this.estado=false;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    //canal 1 al canal 120 y para cambiar de canal necesariamente debe estar encendido el televisor
    public void canalUp(int canal, TV tv){
        boolean x = tv.getEstado();
        if (this.canal<=120 && this.canal>=1 && x==true){
            this.canal += 1;
        }    
    }   
    
    public void canalDown(int canal, TV tv){
        boolean x = tv.getEstado();
        if (this.canal<=120 && this.canal>=1 && x==true){
            this.canal -= 1;
        }
    }
    
    public void volumenUp(int volumen, TV tv){
        boolean x = tv.getEstado();
        if(this.volumen>=0 && this.volumen<=0 && x==true){
            this.volumen+=1;
        }
    }
    
    public void volumenDown(int volumen, TV tv){
        boolean x = tv.getEstado();
        if(this.volumen>=0 && this.volumen<=0 && x==true){
            this.volumen-=1;
        }
    }
    
}
