package br.com.wallet.transacao.constants;

public class RabbitmqConstants {
    private RabbitmqConstants() {
    }

    public static final String EXCHANGE_NAME = "transacao-exchange";

    public static final String QUEUE_NAME = "transacao-queue";

    public static final String ROUTING_KEY = "transacao.routing";
}
