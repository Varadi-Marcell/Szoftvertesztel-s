package uni.miskolc;

import java.time.LocalDate;

public class GyartasiIdoNemMegfelelo extends Throwable {

    public GyartasiIdoNemMegfelelo(LocalDate gyartasiIdo){
        super(gyartasiIdo.toString());
    }

}
