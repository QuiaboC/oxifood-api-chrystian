package br.com.ifpe.oxefood.modelo.comprador;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.modelo.comprador.Comprador.CompradorBuilder;
import br.com.ifpe.oxefood.util.entity.GenericService;

@Service
public class CompradorService extends GenericService{
    @Autowired
   private CompradorRepository repository;

   @Transactional
   public Comprador save(Comprador comprador) {

       super.preencherCamposAuditoria(comprador);
       return repository.save(comprador);
   }
   

   public Comprador save (CompradorBuilder build) {
    return null;
}


//importei o java.util.List;
public List<Comprador> listarTodos() {
  
    return repository.findAll();
}

public Comprador obterPorID(Long id) {

    return repository.findById(id).get();
}
}