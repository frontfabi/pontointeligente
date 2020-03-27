package com.frontfabi.pontointeligente.repositories

import com.frontfabi.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {
  fun findByCnpj(cnpj: String): Empresa
}