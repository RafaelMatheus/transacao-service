package br.com.wallet.transacao.mapper;

import br.com.wallet.transacao.cosumer.event.Transacao;
import br.com.wallet.transacao.entity.TransacaoEntity;
import br.com.wallet.transacao.entity.TransacaoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface TransacaoMapper {
    TransacaoEntity paraTransacaoEntity(Transacao transacao);

    TransacaoResponse paraTransacaoResponse(TransacaoEntity transacao);
}
