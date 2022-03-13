package com.kotlin.rioja.service

import com.kotlin.rioja.dto.BoardDto
import com.kotlin.rioja.model.BoardModel
import com.kotlin.rioja.repository.BoardRepository
import com.kotlin.rioja.request.BoardSearchRequest
//import jdk.nashorn.internal.objects.NativeDebug.map
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors
import javax.naming.directory.SearchResult
import javax.transaction.Transactional
import kotlin.system.exitProcess

@Service
class BoardService{
    @Autowired
    lateinit var  boardRepository : BoardRepository

    fun searchUserInfo(boardSearchRequest:BoardSearchRequest):BoardDto{
        val boardDto = BoardDto()
        boardDto.convertEntityToDto(boardRepository.findById(boardSearchRequest.boardIdx).orElse(null))
        return boardDto
    }
}