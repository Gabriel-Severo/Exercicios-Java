public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        boolean invalido = false;
        //Verifica se a data é valido
        if (dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano < 1 || dia > 29 && mes == 2)
            invalido = true;
        //Verifica se o ano é bissexto permitindo terminar em 28 ou 29
        else if(mes == 2 && dia == 29 && !(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0))
            invalido = true;
        //Verifica se o mes termina em 30 ou 31
        else if(mes < 8 && mes % 2 == 0 && dia == 31 || mes > 9 && mes % 2 != 0 && dia == 31)
            invalido = true;
        return dia + "/" + mes + "/" + ano + (invalido ? " (data inválida!)." : "");
    }
}