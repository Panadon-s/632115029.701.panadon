package Week7;
//632115029 Panadon Saikaew
public class Bicycle {
    int current;
    public int speed;
    public int gear = 1;
    public Bicycle() {
        
    }
    public void Check(){
        System.out.println("Current speed is " + current + " km/hr");
    }
    public void Brake() {
        this.current = current - 5;
        System.out.println("Current speed is " + current + " km/hr");
    }
    public void Speed() {
        if(current<99){
        this.current = current + 5;
        System.out.println("Current speed is " + current + " km/hr");
        }else{
        System.out.println("current speed can't exceed 99 km/hr");
        }
    }
	public void Gear() {
        gear++;
        this.current = current + gear *5;
	}
	
}
