package Ej5;

public class MenuVegano extends Menu {
    private String proteinaVegetal;

    public MenuVegano(String dia, int calorias, String proteina) {
        super(dia, calorias);
        this.proteinaVegetal = proteina;
    }

    public String getProteinaVegetal() {
        return proteinaVegetal;
    }
}
