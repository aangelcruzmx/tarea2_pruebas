public class DiasLluvia {

    private  boolean[][] diasLluviosos;

    public DiasLluvia() {
        this.diasLluviosos = new boolean[12][30];
    }

    //getters


    public boolean[][] getDiasLluviosos() {
        return diasLluviosos;
    }

    //setters

    public void setDiasLluviosos(boolean[][] diasLluviosos) {
        this.diasLluviosos = diasLluviosos;
    }

    public boolean registroDia(int dia, int mes, boolean lluvia) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 30) {
            return false;
        }
        diasLluviosos[mes - 1][dia - 1] = lluvia;
        return true;
    }

    public boolean consultarDia(int dia, int mes) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 30) {
            return false;
        }

        return diasLluviosos[mes - 1][dia - 1];
    }

    public int contarDiasLluviosos() {
        int contador = 0;
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                if (diasLluviosos[mes][dia]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public int trimestreLluvioso() {
        int[] lluviasPorTrimestre = new int[4];
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                if (diasLluviosos[mes][dia]) {
                    int trimestre = mes / 3;
                    lluviasPorTrimestre[trimestre]++;
                }
            }
        }
        int maximo = 0;
        for (int i = 1; i < 4; i++) {
            if (lluviasPorTrimestre[i] > lluviasPorTrimestre[maximo]) {
                maximo = i;
            }
        }
        return maximo + 1; // sedebe ajustar el resultado a +1 para el resultado
    }

    //ele ejercicio dice 365 dias pero son 360 dias
    public int primerDiaLluvia() {
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                if (diasLluviosos[mes][dia]) {
                    // calculo de dias
                    int numeroDia = mes * 30 + dia + 1;
                    return numeroDia;
                }
            }
        }
        return -1; // si retorna le -1 no hubo dias lluviosos
    }
}


























