public class Automovel {
    private String placa;
    private String modelo;

    public Automovel(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}