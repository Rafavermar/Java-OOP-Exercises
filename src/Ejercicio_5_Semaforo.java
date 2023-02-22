
enum ColorSemaforo {ROJO, AMARILLO, VERDE}
public class Ejercicio_5_Semaforo {
    ColorSemaforo color;
    boolean parpadeando;

    public Ejercicio_5_Semaforo(){
        color = ColorSemaforo.ROJO;
        parpadeando = false;
    }

    public Ejercicio_5_Semaforo(ColorSemaforo color, boolean parpadeando){
        this.color = color;
        this.parpadeando = parpadeando;
    }

    void setColor(ColorSemaforo color){
        this.color = color;
    }

    ColorSemaforo getColor(){
        return color;
    }

    void setParpadeando(boolean parpadeando) {
        this.parpadeando = parpadeando;
    }
    boolean getParpadeando() {
        return parpadeando;
    }
}
