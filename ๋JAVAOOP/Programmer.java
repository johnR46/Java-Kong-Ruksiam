class Programmer extends Employee {

     // Overloading Method
     public void skill() {

          System.out.println("No Skill");
     }

     public void skill(String... langulate) {

          for (int i = 0; i < langulate.length; i++) {
               System.out.println("Dev langulate : " + langulate[i]);
          }

     }

}