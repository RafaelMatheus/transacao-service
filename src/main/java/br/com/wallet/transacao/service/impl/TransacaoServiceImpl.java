package br.com.wallet.transacao.service.impl;

import br.com.wallet.transacao.cosumer.event.Transacao;
import br.com.wallet.transacao.entity.TransacaoEntity;
import br.com.wallet.transacao.mapper.TransacaoMapper;
import br.com.wallet.transacao.repository.TransacaoRepository;
import br.com.wallet.transacao.service.TransacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransacaoServiceImpl implements TransacaoService {
    private final TransacaoRepository repository;
    private final TransacaoMapper mapper;

    @Override
    public void criarTransacao(Transacao transacao) {
        TransacaoEntity transacaoEntity = this.mapper.paraTransacaoEntity(transacao);
        transacaoEntity.setDataHoraRecebimentoInformacao(LocalDateTime.now());
        repository.save(transacaoEntity);
    }
}
