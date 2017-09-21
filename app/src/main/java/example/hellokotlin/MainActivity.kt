package example.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strList = ArrayList<String>()
        strList.add("Hello");
        strList.add("World");
        strList.add("Kotlin");
        strList.add("Learning");
        strList.add("Will I");
        my_recycler_view.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        my_recycler_view.adapter =KotlinRecyclerViewAdapter(strList,applicationContext);

    }
}
