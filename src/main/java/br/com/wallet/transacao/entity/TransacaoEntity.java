package br.com.wallet.transacao.entity;

import br.com.wallet.transacao.serializer.OffsetDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Document("transacao")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoEntity {
    @Id
    private String id;
    private String tipoTransacao;
    private Long valorDebitado;
    private String contaOrigem;
    private String agenciaOrigem;
    private String agenciaDestino;
    private String contaDestino;
    private Long valorCreditado;
    @JsonSerialize(using = OffsetDateTimeSerializer.class)
    @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
    private OffsetDateTime timestamp;
    private LocalDateTime dataHoraRecebimentoInformacao;
}
