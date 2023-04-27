class Buku {
  protected String judul;

  public Buku(String judul) {
    this.judul = judul;
  }

  public void info() {
    System.out.println("Judul buku: " + judul);
  }
}
