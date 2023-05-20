package com.labactivity.cookingboys

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.cookingboys.databinding.ActivityCategoryHomeBinding

class categoryHome : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryHomeBinding
      private lateinit var searchView: SearchView
      private lateinit var listView: ListView

    private val originalArrayList = ArrayList<String>()
    private val filteredArrayList = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)





         searchView = findViewById(R.id.searchView)
         listView = findViewById(R.id.listView)


        originalArrayList.add("adobo")
        originalArrayList.add("sinigang")
        originalArrayList.add("bean soup")
        originalArrayList.add("ginataang kalabasa")
        originalArrayList.add("chopsuey")
        originalArrayList.add("butter shrimp")
        originalArrayList.add("beef steak")
        originalArrayList.add("baked mussels")
        originalArrayList.add("paksiw na bangus")

        filteredArrayList.addAll(originalArrayList)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, filteredArrayList)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = filteredArrayList[position]
            val originalPosition = originalArrayList.indexOf(clickedItem)
            when (originalPosition) {
                0 -> startActivity(Intent(this, adobo::class.java))
                1 -> startActivity(Intent(this, sinigang::class.java))
                2 -> startActivity(Intent(this, mongo::class.java))
                3 -> startActivity(Intent(this, pakbet::class.java))
                4 -> startActivity(Intent(this, chopseuy::class.java))
                5 -> startActivity(Intent(this, hipon::class.java))
                6 -> startActivity(Intent(this, beef::class.java))
                7 -> startActivity(Intent(this, tahong::class.java))
                8 -> startActivity(Intent(this, paksiw::class.java))

            }
        }

        listView.visibility = ListView.INVISIBLE

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let {
                    originalArrayList.add(it)
                    filteredArrayList.add(it)
                    adapter.notifyDataSetChanged()
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let {
                    filteredArrayList.clear()
                    filteredArrayList.addAll(originalArrayList.filter { item ->
                        item.contains(newText, ignoreCase = true)
                    })
                    adapter.notifyDataSetChanged()
                }
                return true
            }
        })

        searchView.setOnSearchClickListener {
            listView.visibility = ListView.VISIBLE
        }

        searchView.setOnCloseListener {
            listView.visibility = ListView.INVISIBLE
            false
        }

        binding.root.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                if (!searchView.isFocused) {
                    listView.visibility = ListView.INVISIBLE
                }
            }
            false
        }





        binding.btnaboutus.setOnClickListener(){
            val intent = Intent(this,aboutus::class.java)
            startActivity(intent)
        }

        binding.btnmeat.setOnClickListener(){
            val intent = Intent(this,meats::class.java)
            startActivity(intent)

        }

        binding.btnseafood.setOnClickListener(){
            val intent = Intent(this,seafoods::class.java)
            startActivity(intent)

        }

        binding.btnvege.setOnClickListener(){
            val intent = Intent(this,vegetable::class.java)
            startActivity(intent)

        }




    }



    //  private fun addDataToList(){

  //  }
}