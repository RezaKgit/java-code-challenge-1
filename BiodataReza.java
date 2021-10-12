public class BiodataReza {
  public static void main(String[] args) {
      String firstName, lastName, phoneNumber, address, hoby, favFood;
      int age;
      double height;

      firstName = "Reza ";
      lastName = "Kurniawan";
      address = "Kijang Kota";
      hoby = "Membantu Orang";
      favFood = "Ayam Bakar";
      phoneNumber = "+6281362516";
      age = 21;
      height = 171;
 
      System.out.println("Nama               : " + firstName + lastName + "\n" +
                        "Alamat             : " + address + "\n" +
      					        "Umur               : " + age + " Tahun" + "\n" +
                        "Hobi               : " + hoby + "\n" +
                        "Telepon            : " + phoneNumber + "\n" +
                        "Makanan Kesukaan   : " + favFood + "\n" +
                        "Tinggi Badan       : " + height + " Cm" + "\n");
  }
}