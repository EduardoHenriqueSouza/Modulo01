package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainEx4 {
    public static void main(String[] args) {
        List<IMeioTransporte> meios = new ArrayList<>();
        meios.add(new Carro());
        meios.add(new Bicicleta());
        meios.add(new Trem());

        for (IMeioTransporte meio : meios) {
            try {
                System.out.println("== " + meio + " ==");
                meio.acelerar();
                meio.acelerar();
                System.out.println("Velocidade após acelerar: " + meio.getVelocidade());

                meio.frear();
                System.out.println("Velocidade após frear: " + meio.getVelocidade());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
