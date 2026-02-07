package monitoria2;

public class Celular {
    private String marca;
    private String modelo;
    private boolean estado; 
    private double bateria;
    private double volume;

    Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = false;
        this.bateria = 60;
        this.volume = 70;
    }

    public void toggleEstado() {
        if(estado) this.estado = !estado;
    }

    public boolean usarBateria(double percent) {
        if(this.estado && percent <= (this.getBateria() - 5)) {
            this.bateria -= percent;
            return true;
        } else return false;
    }
    public boolean aumentarVolume() {
        if(this.estado && this.volume <= 95) {
            this.volume += 5;
            return true;
        } else return false;
    }
    public boolean diminuirVolume() {
        if(this.estado && this.volume >= 5) {
            this.volume -= 5;
            return true;
        } else return false;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }

    public boolean getEstado() {
        return this.estado;
    }
    public double getBateria() {
        return this.bateria;
    }

    public boolean podeTocarAlarme() {
        if(this.estado && this.getBateria() > 5) return true;
        else return false;
    }
}