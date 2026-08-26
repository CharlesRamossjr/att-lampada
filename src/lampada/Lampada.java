package formula1.lampada;

public class Lampada {

    //  VARIÁVEIS (atributos da classe)
    // 'ligada' indica se está acesa (true) ou apagada (false).
    // 'watts' representa a potência da lâmpada.
    private boolean ligada;
    private int watts;

    //  CONSTRUTOR 1 (com estado inicial e watts)
    // Este construtor permite criar uma lâmpada definindo tanto se ela começa ligada ou apagada,
    // quanto a sua potência em watts.
    public Lampada(boolean estadoInicial, int watts) {
        this.ligada = estadoInicial;
        this.watts = watts;
    }

    //  CONSTRUTOR 2 (apenas watts)
    // Aqui o usuário define apenas a potência da lâmpada.
    // O estado inicial é padronizado como apagada (false).
    public Lampada(int watts) {
        this.ligada = false;
        this.watts = watts;
    }

    //  CONSTRUTOR 3 (sem argumentos)
    // Esse construtor cria uma lâmpada com valores padrão.
    // A lâmpada começa apagada e com potência de 60 watts.
    public Lampada() {
        this.ligada = false;
        this.watts = 60;
    }

    //  MÉTODO interruptor
    // Esse método inverte o estado atual da lâmpada.
    // Se estava ligada, desliga; se estava desligada, liga.
    public void interruptor() {
        ligada = !ligada;

        if (ligada) {
            System.out.println("A lâmpada foi ligada.");
        } else {
            System.out.println("A lâmpada foi desligada.");
        }
    }

    //  MÉTODO mostrarEstado
    // Exibe no console se a lâmpada está acesa ou apagada no momento.
    // Apenas consulta o valor da variável 'ligada' e imprime o resultado.
    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    //  MÉTODO mostrarWatts
    // Mostra a potência da lâmpada em watts.
    // Esse valor foi definido no construtor no momento da criação do objeto.
    public void mostrarWatts() {
        System.out.println("Potência: " + watts + "W");
    }
}