package com.kotlin.rioja.request

import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class BoardSearchRequest {
    var boardIdx : Long = 0
    var title : String? = null
    var contents : String? = null
    var hitCnt: Int = 0
    var createdDatetime: LocalDateTime? = null
    var creatorId: String? = null
    var updatedDatetime: LocalDateTime? = null
    var updaterId: String? = null
    var deletedYn: String? = null
}