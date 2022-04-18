package com.example.example

import com.example.styliticsnetworkcalls.model.ClientItemIds

data class Items(

    var promotions: ArrayList<String> = arrayListOf(),
    var category: String,
    var tags: ArrayList<String> = arrayListOf(),
    var largeImageUrl: String,
    var otherClientItemIds: ClientItemIds,
    var smallImageUrl: String,
    var color: String,
    var accountId: Int,
    var productId: String,
    var itemId: Int,
    var name: String,
    var affiliateLink: String,
    var username: String,
    var baseImageUrl: String,
    var imageUrl: String,
    var brand: String,
    var style: String,
    var remoteId: String,
    var sku: String,
    var stocked: Boolean,
    var salePrice: Double,
    var retailerStyle: String,
    var clientOriginalImageUrl: String,
    var accountUsername: String,
    var retailer: String,
    var gender: String,
    var skus: String,
    var retailerColor: String,
    var price: Double,
    var pattern: String

)