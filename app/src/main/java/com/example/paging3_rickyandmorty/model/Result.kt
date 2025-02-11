package com.example.paging3_rickyandmorty.model


import com.example.paging3_rickyandmorty.data.CharacterModel
import com.google.gson.annotations.SerializedName



data class Result(
    @SerializedName("created")
    val created: String,
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
) {
    fun toPresentation(): CharacterModel {
        return CharacterModel(
            id = id,
            name = name,
            image = image,
            isAlive = status == "Alive",
            gender = gender,
            url = url
        )
    }
}