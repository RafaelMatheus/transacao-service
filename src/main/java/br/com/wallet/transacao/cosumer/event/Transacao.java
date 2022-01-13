package br.com.wallet.transacao.cosumer.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transacao {
    private String tipoTransacao;
    private String idUsuario;
    private Long valorDebitado;
    private String contaOrigem;
}
