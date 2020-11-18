public class Main {
   public static void main(String[] args) {
      Cat cat = new Cat("Vaska", 4);
      Dog dog = new Dog("Barbos", 8);
      cat.talk();
      dog.talk();
      cat.setName("Murka");
      dog.setAge(4);
   }


}