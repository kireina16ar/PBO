class Novel extends Buku {
    private String pengarang;
  
    public Novel(String judul, String pengarang) {
      super(judul);
      this.pengarang = pengarang;
    }
  
    public void info() {
      System.out.println("Novel " + judul + " karya " + pengarang);
    }
  }
  