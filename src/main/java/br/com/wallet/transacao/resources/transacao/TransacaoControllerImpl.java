package br.com.wallet.transacao.resources.transacao;

import br.com.wallet.transacao.entity.TransacaoResponse;
import br.com.wallet.transacao.service.TransacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transacoes")
@RequiredArgsConstructor
public class TransacaoControllerImpl implements TransacaoController {
    private final TransacaoService transacaoService;

    @Override
    public Page<TransacaoResponse> encontrarContaPorAgencia(Pageable pageable, @PathVariable String numeroConta) {
        return this.transacaoService.retornarTransacoes(pageable, numeroConta);
    }
}
