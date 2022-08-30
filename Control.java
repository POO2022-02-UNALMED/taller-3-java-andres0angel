package taller3.televisores;

public class Control {
    TV tv;
    TV ins = new TV(tv.marca, true);
    /*El control podrá hacer uso de los métodos del televisor de manera remota, para
    lo cual se definirán los métodos: turnOn, turnOff, canalUp, canalDown,
    volumenUp, volumenDown y setCanal.*/
    public void turnOn(){
        ins.turnOn();
    }
        
    public void turnOff(){
        ins.turnOff();
    }
    
    public void canalUp(){
        ins.canalUp(1, tv);
    }
    
    public void canalDown(){
        ins.canalDown(1, tv);
    }
    
    public void volumenUp(){
        ins.volumenUp(1, tv);
    }
    
    public void volumenDown(){
        ins.volumenDown(1, tv);
    }
    
    public void enlazar(TV tv){
        this.tv = tv;
        
    }
    
    public void setCanal(int canal){
        tv.setControl(this);
    }
    
    public void setTv(TV tv){
        this.tv = tv;
    }
    
    public TV getTv(){
        return tv;
    }
    
    
}
