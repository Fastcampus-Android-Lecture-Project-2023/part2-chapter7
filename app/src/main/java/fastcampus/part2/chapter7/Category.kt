package fastcampus.part2.chapter7

import com.google.gson.annotations.SerializedName

enum class Category {
    @SerializedName("POP")
    POP,    // 강수확률

    @SerializedName("PTY")
    PTY,    // 강수형태

    @SerializedName("SKY")
    SKY,    // 하늘 상태

    @SerializedName("TMP")
    TMP,    // 1시간 기온
}