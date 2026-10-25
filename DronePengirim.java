public class DronePengirim extends Armada{
    private int batasKetinggianMaksimal;

  public DronePengirim(String noPlat, String merk, double kapasitasKG, int batasKetinggianMaksimal){
    super(noPlat, merk, kapasitasKG);
    this.batasKetinggianMaksimal = batasKetinggianMaksimal;
  }
  @Override
  public double hitungOperasional() {
      // TODO Auto-generated method stub
      return  (kapasitasKG * 10.000) + 50.000;
  }
  @Override
  public void tampilkanInfoArmada() {
      // TODO Auto-generated method stub
      super.tampilkanInfoArmada();
  }
    
}
