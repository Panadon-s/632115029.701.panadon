package Week5;

//Panadon Saikaew[632115029]
public class NerfGun {
    private int ammunition = 0;
    private static int GunID = 0;
    
    public NerfGun() {
        GunID++;
    }
    public NerfGun(int newAmmunition) {
        ammunition = newAmmunition;
        GunID++;

    }
    public int getAmmo() {
        return ammunition;
    }
    public void setAmmo(int newAmmunition) {
        ammunition = newAmmunition;
    }
    public int fire() {
        if (ammunition == 0){
            System.out.println("There is no ammo");
        }else{
        System.out.println("BANG!");
        return ammunition -= 1;
        }
        return ammunition;
    }
    public void reload(int ammo) {
        if (ammunition + ammo > 15) {
            System.out.println("Ammunition Overload!");
        }else{
            ammunition += ammo;
        }
    }
    public void displayNumOfAmmunition() {
        System.out.println(ammunition + " bullet left");
    }
    public void displayGunID() {
        System.out.println("The ID of this gun is " + GunID);
    }
}
