package com.kotlin.rioja.controller

import com.kotlin.rioja.dto.BoardDto
import com.kotlin.rioja.repository.BoardRepository
import com.kotlin.rioja.request.BoardSearchRequest
import com.kotlin.rioja.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController {
    @Autowired
    var boardService = BoardService()

    @GetMapping("/board")
    fun getBoardList(@ModelAttribute request: BoardSearchRequest): BoardDto {
        request.boardIdx = 2
        val boardDto:BoardDto =  boardService.searchUserInfo(request)
        return boardDto
    }
}