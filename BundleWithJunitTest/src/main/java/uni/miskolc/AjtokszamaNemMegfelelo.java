package uni.miskolc;

public class AjtokszamaNemMegfelelo extends Exception {
    public AjtokszamaNemMegfelelo(int ajtokSzama) {
        super(String.valueOf(ajtokSzama));
    }


}
