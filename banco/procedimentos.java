package banco;

public class procedimentos {

    public static void main(String[] args) {

        Pessoa gustavoomai = new Pessoa();
        gustavoomai.setNome("Gustavo Omai");

        Conta contaGustavoOmai= new Conta(1234,123);
        contaGustavoOmai.setTitular(gustavoomai);

        contaGustavoOmai.setNumero(1234);
        System.out.println(contaGustavoOmai.getNumero());

        System.out.println(contaGustavoOmai.getTitular().getNome());

    }

}


