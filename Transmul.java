class Bicycle {
void displayFeatures() {
System.out.println("Features: Pedals, Manual power");
}
}
class Motorbike extends Bicycle {
void displayFeatures() {
super.displayFeatures();
System.out.println("Added feature by Motorbike: Engine");
}
}
class ElectricBike extends Motorbike {
void displayFeatures() {
super.displayFeatures();
System.out.println("New feature by ElectricBike: Electric motor and battery");
}
}
class Transmul {
public static void main(String args[]) {
ElectricBike myEbike = new ElectricBike();
myEbike.displayFeatures();
}
}