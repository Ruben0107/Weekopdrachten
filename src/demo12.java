class Demo{
   public static void main(String[] args) {   
      Bij bij = new Bij();
      Bij bij2 = new Bij("zoem");
      System.out.println(bij.jib);
      System.out.println(bij2.jib);
   }
}
class Bij{
   static Bij bij;
   String jib;
   Bij(String bij){
      jib = bij;
      System.out.println("emoz");
   }
   Bij() {
      this("moez");
   }
}