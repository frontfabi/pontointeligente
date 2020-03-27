package com.frontfabi.pontointeligente.documents

import org.springframework.data.mongodb.core.mapping.Document
import com.frontfabi.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import java.util.*

@Document
data class Lancamento (
  val data: Date,
  val tipo: TipoEnum,
  val funcionarioID: String,
  val descricao: String? = "",
  val localizacao: String? = "",
  @Id val id: String? = null
)