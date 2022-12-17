package com.aljaldak.culmix.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

data class RegisterRequest(
    val account_id: String,
    val password: String,
    val last_name: String,
    val first_name: String,
    val my_lang: String,
    val email: String,
)

data class LoginRequest(
    val account_id: String,
    val password: String,
)

data class PostHomeRequest(
    val address: String,
    val content: String,
    val culture: String,
    val home_category: String,
    val home_image_url: String,
    val home_info: String,
    val home_size: Int,
    val item: String,
    val location: String,
    val max_people_size: Int,
    val room_counts: Int,
    val share: String,
    val title: String,
)

data class GetPartnersResponse(
    val partnerHomeInformation: List<PartnerHomeInformation>,
)

data class PartnerHomeInformation(
    val partnerName: String,
    val partnerScore: String,
    val homeName: String,
    val location: String,
    val pictureURL: String,
    val buildingType: String,
    val wide: Int,
    val maxPeople: Int,
)

data class GetHomesResponse(
    val homeInformation: List<HomeInformation>,
)

data class HomeInformation(
    val address: String,
    val userName: String,
    val country: String,
)

data class GetMyPageInformationResponse(
    val userName: String,
    val score: String,
    val introduction: String,
)

data class PostReviewResponse(
    val contents: String,
)

fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        with(serverAPIProvider) {
            postHome(
                PostHomeRequest(
                    "1234",
                    "1234",
                    "1234",
                    "1234",
                    "1234",
                    "1234",
                    1234,
                    "1234",
                    "1234",
                    1234,
                    1234,
                    "1234",
                    "1234",
                )
            )
            getPartners(
                "Hello"
            )
            like(
                "I am"
            )
            getHomes(
                "Android",
                "But",
            )
            getMyPageInformation(
                "I want",
            )
            postReview(
                "to use", 1,
            )
            cancelLike(
                "iPhone", 5,
            )
        }
    }
}