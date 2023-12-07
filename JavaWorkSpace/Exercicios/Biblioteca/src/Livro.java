public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    Livro(String titulo, String autor, String isbn ){
      this.emprestado = false;
      this.titulo = titulo;
      this.autor = autor;
      this.isbn = isbn;

    }
    public boolean reservar(){
        if (this.emprestado == false){
            this.emprestado = true;
            System.out.println("Livro reservado");
            return true;
        }
        else{
            return false;
            
        }
    }

    public void devolver(){
        this.emprestado = false;
    }
    
    public String exibir_info(){
        return "Título: " + this.titulo + "\n" +
               "Autor: " + this.autor + "\n" +
               "ISBN: " + this.isbn + "\n" +
               "Emprestado: " + (this.emprestado ? "Sim" : "Não");
    }
    
}
