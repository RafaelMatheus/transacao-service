package br.com.wallet.transacao.cosumer;

import br.com.wallet.transacao.cosumer.event.Transacao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

import static br.com.wallet.transacao.constants.RabbitmqConstants.QUEUE_NAME;

@Configuration
@Slf4j
public class RabbitmqConsumer {
    @RabbitListener(queues = {QUEUE_NAME})
    public void consumer(@Payload Transacao mensagem) {
        log.info("Mensagem {}", mensagem);
    }
}
