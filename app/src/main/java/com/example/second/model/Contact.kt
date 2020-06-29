package com.example.second.model

class Contact {
//    String name = "";
    var name: String? = null
    var phone: String? = null
    var image: String? = null
    var code: String? = "996"
}

data class Member(
    var name: String? = null,
    var phone: String? = null,
    var isFriend: Boolean? = null
)