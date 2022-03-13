package com.kotlin.rioja.model

import com.kotlin.rioja.dto.BoardDto
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.sql.Timestamp
import java.time.LocalDateTime
import javax.persistence.*

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "t_board")
//class BoardModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "board_idx") var boardIdx: Int = 0
//    var title: String? = null
//    var contents: String? = null
//    @Column(name = "hit_cnt") var hitCnt: Int = 0
//    @Column(name = "created_datetime") var createdDatetime: Timestamp? = null
//    @Column(name = "creator_id") var creatorId: String? = null
//    @Column(name = "updated_datetime") var updatedDatetime: Timestamp? = null
//    @Column(name = "updater_id") var updaterId: String? = null
//    @Column(name = "deleted_yn") var deletedYn: String? = null
//
//}
@Entity
@Table(name = "t_board")
data class BoardModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var boardIdx:Long,
    var title:String?,
    var contents:String?,
    var hitCnt:Int,
    var createdDatetime: LocalDateTime?,
    var creatorId:String?,
    var updatedDatetime: LocalDateTime?,
    var updaterId:String?,
    var deletedYn:String?
)