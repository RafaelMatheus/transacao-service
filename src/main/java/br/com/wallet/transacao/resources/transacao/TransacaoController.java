package br.com.wallet.transacao.resources.transacao;

import br.com.wallet.transacao.entity.TransacaoResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface TransacaoController {
    @ApiOperation(value = "Obter todas as transações de determinada conta.")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{numeroConta}/contas")
    Page<TransacaoResponse> encontrarContaPorAgencia(Pageable pageable, @PathVariable String numeroConta);
}
