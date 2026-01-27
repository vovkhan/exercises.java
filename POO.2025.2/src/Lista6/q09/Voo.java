package Lista6.q09;
/*
Escreva uma classe para representar um voo que acontece em uma data e horário. Cada voo possui no máximo
100 passageiros, e a classe permite controlar a ocupação das vagas, além de outras informações básicas sobre o
voo. A classe deve ter um construtor que recebe os dados do voo como parâmetro, e ao menos os seguintes
métodos:
• Um método que informa o número da próxima cadeira livre;
• Um método que verifica se uma cadeira está ocupada;
• Um método que ocupa uma cadeira de interesse e retorna uma flag sinalizando se a operação foi bem
sucedida;
• Um método que informa o número de cadeiras não ocupadas.
Identifique e implemente os atributos da classe com base nesses dados, além de outros métodos que possam se
aplicar nesse contexto. Utilize o conceito de ocultação de informação.
*/

import java.time.LocalDateTime;

public class Voo {
    private LocalDateTime 
    private boolean[] assentosVagos;

    Voo(String data, String hora) {
        this.assentosVagos = new boolean[100];
        this.data = DateTimeFormatter();
        this.hora = hora;
    }
}
