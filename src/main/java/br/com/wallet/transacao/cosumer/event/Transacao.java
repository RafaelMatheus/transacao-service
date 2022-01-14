package br.com.wallet.transacao.cosumer.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transacao {
    private String tipoTransacao;
    private Long valorDebitado;
    private String contaOrigem;
    private String agenciaOrigem;
    private String agenciaDestino;
    private String contaDestino;
    private Long valorCreditado;
}
