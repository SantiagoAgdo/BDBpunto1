public class caracteristica2{

    public void state() {
        System.out.println("in construction");
    }
    
    public boolean abierto(int hour) {
        if(hour > 8 && hour < 17){
            return true;
        }else{
            return false;
        }
    }
    
}