package com.malkinfo.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    private lateinit var tvText:TextView
    private lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set id*/
        tvText = findViewById(R.id.textV)
        img = findViewById(R.id.image)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.item_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.info->{
                tvText.text = "Information"
                img.setImageResource(R.drawable.ic_info)
                textMassage("this is Information Menu")
                true
            }
            R.id.share->{
                tvText.text = "share"
                img.setImageResource(R.drawable.ic_share)
                textMassage("this is Share Menu")
                true
            }
            R.id.setting->{
                tvText.text = "Setting"
                img.setImageResource(R.drawable.ic_settings)
                textMassage("this is setting Menu")
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
    fun textMassage(s:String){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
    }
   /**ok now run it*/
}