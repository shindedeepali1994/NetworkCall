package com.example.example

data class OutfitItems(

    var lookbookImageUrl: String,
    var tags: ArrayList<String> = arrayListOf(),
    var primaryStyliticsItemId: Int,
    var largeImageUrl: String,
    var accountId: Int,
    var versionId: Int,
    var transparentImageUrl: String,
    var username: String,
    var sessionId: String,
    var baseImageUrl: String,
    var impressionId: String,
    var imageUrl: String,
    var primaryRemoteId: String,
    var updatedAt: String,
    var coverImageUrl: String,
    var id: Int,
    var accountUsername: String,
    var items: ArrayList<Items> = arrayListOf()

)