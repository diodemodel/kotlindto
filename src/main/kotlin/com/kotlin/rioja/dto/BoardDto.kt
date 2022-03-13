package com.kotlin.rioja.dto

import com.kotlin.rioja.model.BoardModel
import lombok.Data
import java.time.LocalDateTime
import java.time.LocalTime
import javax.persistence.Id

@Data
class BoardDto {
    private var boardIdx: Long = 0
    private var title: String? = null
    private var contents: String? = null
    private var hitCnt: Int = 0
    private var createdDatetime: LocalDateTime? = null
    private var creatorId: String? = null
    private var updatedDatetime: LocalDateTime? = null
    private var updaterId: String? = null
    private var deletedYn: String? = null


    public fun convertEntityToDto(boardModel: BoardModel) {
        boardIdx = boardModel.boardIdx
        title = boardModel.title
        contents = boardModel.contents
        hitCnt = boardModel.hitCnt
        createdDatetime = boardModel.createdDatetime
        creatorId = boardModel.creatorId
        updatedDatetime = boardModel.updatedDatetime
        updaterId = boardModel.updaterId
        deletedYn = boardModel.deletedYn
    }
}