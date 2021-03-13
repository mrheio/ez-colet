package proj.ezcolet.courier

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import proj.ezcolet.ExampleItem
import proj.ezcolet.R

class Adapter(private val List:List<ExampleItem>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.courier_card_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem=List[position]
        holder.textView1.text=currentItem.text1
        holder.textView2.text=currentItem.text2
    }

    override fun getItemCount()=List.size
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textView1: TextView =itemView.findViewById(R.id.text_view_card1)
        val textView2: TextView=itemView.findViewById(R.id.text_view_card2)
    }

}