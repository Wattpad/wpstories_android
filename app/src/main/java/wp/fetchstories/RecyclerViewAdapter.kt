package wp.fetchstories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewAdapter :
    ListAdapter<Story, RecyclerViewAdapter.RecyclerViewHolder>(DiffCallback()) {

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = getItem(position)
        holder.bindData(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return RecyclerViewHolder(view)
    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val storyTitle = itemView.findViewById<TextView>(R.id.story_title)
        val storyAuthor = itemView.findViewById<TextView>(R.id.story_author)
        val storyCover = itemView.findViewById<ImageView>(R.id.story_cover)

        fun bindData(story: Story) {
            storyTitle.text = story.title
            storyAuthor.text = story.user.name
            Glide.with(itemView.context)
                .load(story.cover)
                .into(storyCover)
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Story>() {
    override fun areItemsTheSame(oldItem: Story, newItem: Story): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Story, newItem: Story): Boolean {
        return oldItem == newItem
    }
}
