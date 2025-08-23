public class ModeloDTO {

    private Integer idModelo;
    private String nombreArtista;
    private String correo;




    public ModeloDTO(Integer idModelo, String nombreArtista, String correo) {
        this.idModelo = idModelo;
        this.nombreArtista = nombreArtista;
        this.correo = correo;
    }


    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
