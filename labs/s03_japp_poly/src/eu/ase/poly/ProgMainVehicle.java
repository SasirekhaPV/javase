package eu.ase.poly;

public class ProgMainVehicle {

	public static void main(String[] args) {
		Vehicle v = null;
		Auto a = new Auto(1200, 5);
		Plane p = new Plane(15000, 12, 2);
		
		v = a;
		System.out.println(v.display());
		
		v = p;
		System.out.println(v.display());
		
		Vehicle v0 = null;
        v0 = a; //Auto -> Vehicul - up-cast (is implicit)
        //after 270 code lines
        // try-catch mechanism
        try {
            p = (Plane)v0;
        } catch(ClassCastException cce) {
            cce.printStackTrace();
        }        
        
        Movement im0 = new Auto(2900, 4);
        //im0.afis();//eroare la compilare
        im0.startEngine();
        
        System.out.println("No Cars = " + Auto.getNoCars());
        // try-with-resources mechanism
        try(Auto aa = new Auto(3000, 5)) {
        		aa.display();
        		System.out.println("No Cars = " + Auto.getNoCars());
        } catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("No Cars = " + Auto.getNoCars());
        
	}

}
