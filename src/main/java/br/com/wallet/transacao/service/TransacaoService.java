package br.com.wallet.transacao.service;

import br.com.wallet.transacao.cosumer.event.Transacao;

public interface TransacaoService {
    void criarTransacao(Transacao transacao);
}
