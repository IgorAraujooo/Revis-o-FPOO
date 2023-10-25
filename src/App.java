import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {

        //  Exemplo POO
        Pessoas pessoa1 = new Pessoas("Igor", 16);
        Pessoas pessoa2 = new Pessoas("Mineiro", 16);

        // Exemplo Encapsulamento
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa2.getIdade());

        // Exemplo Herança
        Pessoas aluno1 = new Aluno("Cleber", 35);
        Pessoas alubo2 = new Aluno("Marta", 27);

        System.out.println(aluno1.getNome());
        System.out.println(alubo2.getNome());

        // Exemplo Polimorfismo
        aluno1.passarTempo();

        // Exemplo Abstração
       aluno1.exibirSaldo();
    }
}