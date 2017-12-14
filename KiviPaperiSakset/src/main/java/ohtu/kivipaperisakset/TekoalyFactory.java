package ohtu.kivipaperisakset;

public class TekoalyFactory {

    int siirto = 0;

    public TekoalyFactory() {
        siirto = 0;
    }

    public String annaSiirto() {
        siirto = (siirto + 1) % 3;

        switch (siirto) {
            case 0:
                return "k";
            case 1:
                return "p";
            default:
                return "s";
        }
    }
}
