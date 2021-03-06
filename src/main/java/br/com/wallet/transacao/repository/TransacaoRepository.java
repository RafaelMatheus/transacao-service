package br.com.wallet.transacao.repository;


import br.com.wallet.transacao.entity.TransacaoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransacaoRepository extends MongoRepository<TransacaoEntity, String> {
    Page<TransacaoEntity> findByContaOrigem(Pageable pageable, String contaOrigem);
}
