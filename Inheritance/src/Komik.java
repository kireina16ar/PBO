class Komik extends Buku {
    private int halaman;
  
    public Komik(String judul, int halaman) {
      super(judul);
      this.halaman = halaman;
    }
  
    public void info() {
      System.out.println("Komik " + judul + " berhalaman " + halaman);
    }
  }
  