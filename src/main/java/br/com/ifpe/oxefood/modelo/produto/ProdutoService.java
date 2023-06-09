package br.com.ifpe.oxefood.modelo.produto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.modelo.produto.Produto.ProdutoBuilder;
import br.com.ifpe.oxefood.util.entity.GenericService;

@Service
public class ProdutoService extends GenericService{
    
    @Autowired
    private ProdutoRepository repository;
 
    @Transactional
    public Produto save(Produto produto) {
 
        super.preencherCamposAuditoria(produto);
        return repository.save(produto);
    }
    @Transactional
   public void update(Long id, Produto produtoAlterado) {

      Produto produto = repository.findById(id).get();
      produto.setTitulo(produtoAlterado.getTitulo());
      produto.setCodigo(produtoAlterado.getCodigo());
      produto.setDescricao(produtoAlterado.getDescricao());
      produto.setValorUnitario(produtoAlterado.getValorUnitario());
      produto.setTempoEntregaMinima(produtoAlterado.getTempoEntregaMinima());
      produto.setTempoEntregaMaximo(produtoAlterado.getTempoEntregaMaximo());
	    
      super.preencherCamposAuditoria(produto);
      repository.save(produto);
  }


    public Produto save(ProdutoBuilder build) {
        return null;
    }

    //importei o java.util.List;
   public List<Produto> listarTodos() {
  
    return repository.findAll();
}

public Produto obterPorID(Long id) {

    return repository.findById(id).get();
}
 
}
