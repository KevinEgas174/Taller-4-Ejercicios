package CalculadoraFC_3_16;

public class CalculadorFC {

    private String primerNombre;
    private String apellidoPaterno;
    private int dia;
    private int mes;
    private int anio;

    public CalculadorFC(String primerNombre, String apellidoPaterno, int dia, int mes, int anio) {
        setPrimerNombre(primerNombre);
        setApellidoPaterno(apellidoPaterno);
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >=0 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes >= 0  && mes <= 12){
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio >= 1926) {
            this.anio = anio;
        }
    }


}
