package Ej5;

public class MenuCeliaco extends Menu {
    private boolean certificadoSinTACC;

    public MenuCeliaco(String dia, int calorias, boolean certificado) {
        super(dia, calorias);
        this.certificadoSinTACC = certificado;
    }

    public boolean isCertificadoSinTACC() {
        return certificadoSinTACC;
    }
}
