package com.kotlin.rioja.dto

import com.kotlin.rioja.model.BoardModel
import lombok.Data
import java.time.LocalDateTime
import java.time.LocalTime
import javax.persistence.Id

@Data
class BoardDto {
    var boardIdx: Long = 0
    var title: String? = null
    var contents: String? = null
    var hitCnt: Int = 0
    var createdDatetime: LocalDateTime? = null
    var creatorId: String? = null
    var updatedDatetime: LocalDateTime? = null
    var updaterId: String? = null
    var deletedYn: String? = null


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