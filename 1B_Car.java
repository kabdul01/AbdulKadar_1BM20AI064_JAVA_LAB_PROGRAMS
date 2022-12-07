class Car {
   private int model;
   private String make;
   private int speed;

   Car(int model, String make, int speed) {
      this.model = model;
      this.make = make;
      this.speed = speed;
   }

   public int getModel() {
      return this.model;
   }

   public String getMake() {
      return this.make;
   }

   public int getSpeed() {
      return this.speed;
   }

   void accelerate() {
      this.speed += 5;
      System.out.println("Accelerating --> Speed: " + speed);
   }

   void brake() {
      this.speed -= 5;
      System.out.println("Decelerating --> Speed: " + speed);
   }
}

public class _1b_Car {
   public static void main(String[] args) {
      Car car = new Car(2020, "i20 Sportz", 72);
      System.out.println("Car: " + car.getMake() + ", Model: " + car.getModel() + ", Initial Speed: " + car.getSpeed());
      System.out.println();

      for (int i = 1; i <= 5; i++)
         car.accelerate();
      System.out.println();

      for (int i = 1; i <= 5; i++)
         car.brake();
      System.out.println();
   }
}
