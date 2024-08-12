package wp.fetchstories

import com.google.gson.annotations.SerializedName

data class StoriesResponse(
    @SerializedName("stories") val stories: List<Story>,
    @SerializedName("nextUrl") val nextUrl: String
)

data class Story(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("user") val user: User,
    @SerializedName("cover") val cover: String
)

data class User(
    @SerializedName("name") val name: String,
    @SerializedName("avatar") val avatar: String,
    @SerializedName("fullname") val fullname: String
)