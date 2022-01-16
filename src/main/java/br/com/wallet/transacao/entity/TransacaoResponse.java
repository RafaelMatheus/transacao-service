package br.com.wallet.transacao.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransacaoResponse {
    private String id;
    private String tipoTransacao;
    private Long valorDebitado;
    private String contaOrigem;
    private String agenciaOrigem;
    private String agenciaDestino;
    private String contaDestino;
    private Long valorCreditado;
    @JsonSerialize(using = OffsetDateTimeSerializer.class)
    private OffsetDateTime timestamp;
}
