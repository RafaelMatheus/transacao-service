package br.com.wallet.transacao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHoraRecebimentoInformacao;
}
