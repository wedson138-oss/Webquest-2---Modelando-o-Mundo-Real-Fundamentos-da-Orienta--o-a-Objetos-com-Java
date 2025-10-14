import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC-1234", "Toyota", "Corolla", 2020, 95000, 4));
        veiculos.add(new Carro("DEF-5678", "Honda", "Civic", 2021, 110000, 4));
        veiculos.add(new Carro("GHI-9012", "Fiat", "Argo", 2019, 65000, 4));
        veiculos.add(new Moto("JKL-3456", "Yamaha", "MT-03", 2022, 32000, 321));
        veiculos.add(new Moto("MNO-7890", "Honda", "CG 160", 2020, 15000, 162));
        veiculos.add(new Caminhao("PQR-1122", "Volvo", "FH 540", 2023, 480000, 6.5));

        System.out.println("=== Veículos da Concessionária ===");
        for (Veiculo v : veiculos) {
            v.exibirInformacoes();
        }
    }
}
