package example.hellokotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.sample_layout.view.*

/**
 * Created by bharath on 18/9/17.
 */
class KotlinRecyclerViewAdapter (private val dataList : ArrayList<String>, private val context: Context) : RecyclerView.Adapter<KotlinRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.sample_layout,parent,false);
        return ViewHolder(v);


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItems(dataList[position],context)
        }

    override fun getItemCount(): Int = dataList.size


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(dataString : String, context: Context){
            itemView.tv_item.text = dataString;
            itemView.setOnClickListener(View.OnClickListener {
                    context.toast(dataString)
            })
        }

        fun Context.toast(message: CharSequence) =
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

}