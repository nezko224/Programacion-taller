package Ej5;

public class Menu {
    protected String diaSemana;
    protected int caloriasTotales;

    public Menu(String diaSemana, int caloriasTotales) {
        this.diaSemana = diaSemana;
        setCaloriasTotales(caloriasTotales);
    }

    public int getCaloriasTotales() {
        return caloriasTotales;
    }

    public void setCaloriasTotales(int caloriasTotales) {
        if (caloriasTotales >= 0) {
            this.caloriasTotales = caloriasTotales;
        } else {
            System.out.println("Calorías inválidas, se asigna 0");
            this.caloriasTotales = 0;
        }
    }

    public String getDiaSemana() {
        return diaSemana;
    }
}
