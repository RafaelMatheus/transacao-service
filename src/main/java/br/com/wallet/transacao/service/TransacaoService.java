package br.com.wallet.transacao.service;

import br.com.wallet.transacao.cosumer.event.Transacao;
import br.com.wallet.transacao.entity.TransacaoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TransacaoService {
    void criarTransacao(Transacao transacao);

    Page<TransacaoResponse> retornarTransacoes(Pageable pageable, String numeroConta);
}
