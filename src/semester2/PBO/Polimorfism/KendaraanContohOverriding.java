package semester2.PBO.Polimorfism;

import java.util.ArrayList;

class Kendaraan {
   public void bahanbakar() {
      System.out.println("\nKendaraan berbahan bakar");
   }
}

class Motor extends Kendaraan {
   public void bahanbakar() {
      System.out.println("\nMotor berbahan bakar bensin");
   }

}

class MotorKarburator extends Motor {
   public void bahanbakar() {
      System.out.println("\nMotor berbahan bakar bensin dengan pengapian karburator");
      super.bahanbakar();
      System.out.println("Diatas ini ada supernya");
   }
}

class MotorInjeksi extends Motor {
   public void bahanbakar() {
      System.out.println("\nMotor berbahan bakar bensin dengan pengapian injeksi");
   }
}

class Mobil extends Kendaraan {
   public void bahanbakar() {
      System.out.println("\nMobil berbahan bakar bensin");
   }
}

class MobilListrik extends Mobil {
   public void bahanbakar() {
      System.out.println("\nMobil berbahan bakar liztrik zero emission");
   }
}

class Keretapi extends Kendaraan {
   public void bahanbakar() {
      System.out.println("\nKaretaapi berbahan bakar batubara");
   }
}

class Pesawat extends Kendaraan{
   public void bahanbakar() {
      System.out.println("\nPesawar berbahan bakar bensol");
   }
}
class MobilNuklir extends Mobil{
   public void bahanbakar() {
      System.out.println("\nmobil berbahan bakar nuklir");
   }
}



class KendaraanContohOverriding{
   public static void main(String[] aasdasdadasdas){
      ArrayList<Kendaraan> ar = new ArrayList<>();

      ar.add(new Kendaraan());
      ar.add(new Keretapi());
      ar.add(new Mobil());
      ar.add(new Pesawat());
      ar.add(new Motor());
      ar.add(new MotorKarburator());
      ar.add(new MotorInjeksi());
      ar.add(new MobilListrik());
      ar.add(new MobilNuklir());




      for (int a=0; a<ar.size(); a++){
         ar.get(a).bahanbakar();


         if (ar.get(a) instanceof Mobil){
            System.out.println("contoh implementasi lainnya");
         }



      }
   }

}