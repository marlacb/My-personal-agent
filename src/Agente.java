public class Agente {
    // ATRIBUTOS
    private String nome;
    private String objetivo;
    private String perfil;

    public Agente(String nome, String objetivo, String perfil) {
        this.nome = nome;
        this.objetivo = objetivo;
        this.perfil = perfil;

    }
    // GETTER DO NOME
    public String getNome() {
        return nome;
    }

    // RESPOSTA DO AGENTE
    public void responder(String mensagem) {

        mensagem = mensagem.toLowerCase();

        if (mensagem.contains("estudar")) {
            System.out.println(nome + ": Que tal reservar um horário para estudar?");
        }

        else if (mensagem.contains("trabalho")) {
            System.out.println(nome + ": Vamos organizar suas tarefas de trabalho.");
        }

        else if (mensagem.contains("mercado")) {
            System.out.println(nome + ": Posso ajudar você a criar uma lista de compras.");
        }

        else if (mensagem.contains("oi") || mensagem.contains("olá")) {
            System.out.println(nome + ": Olá! Como posso ajudar você hoje?");
        }

        else {
            System.out.println(nome + ": Entendi. Vou tentar ajudar você.");
        }
    }
    // MOSTRAR INFORMAÇÕES DO AGENTE
    public void apresentar() {

        System.out.println("\n==============================");
        System.out.println("        MY AGENT");
        System.out.println("==============================");
        System.out.println("Nome: " + nome);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Perfil: " + perfil);
        System.out.println("==============================");
    }
}