package wp.fetchstories

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("stories?offset=0&limit=10&fields=stories(id,title,cover,user)&filter=new")
    fun getAllStories(): Call<StoriesResponse>
}