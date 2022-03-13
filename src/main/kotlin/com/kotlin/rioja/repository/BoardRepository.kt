package com.kotlin.rioja.repository

import com.kotlin.rioja.model.BoardModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository:JpaRepository<BoardModel, Long>  {
}