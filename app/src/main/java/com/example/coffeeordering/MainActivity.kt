package com.example.coffeeordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
var count:Int=0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun plus(view: View)
    {
       count++
        textView2.text= "$count"
    }

    fun minus(view: View)
    {
        count--
        textView2.text="$count"
    }

    fun order(view: View)
    {
        var price:Double= (count*4.0)
       tvOrder.text="Quantity: $count"
        if (checkBox.isChecked)
        {
            tvCream.text="Add Whipped Cream? Yes "


            price=(count*4.0)+0.5
        }
        else{
            tvCream.text="Add Whipped Cream? No "
        }
        if (checkBox2.isChecked)
    {
        tvChoc.text="Add Chocolate? Yes"
        price=(count*4.0)+1.0
    }
        else
        {
            tvChoc.text="Add Chocolate? No"

        }
        if (checkBox2.isChecked&&checkBox.isChecked){
            price=(count*4.0)+0.50+1.0
        }
        tvPrice.text="Price=$$price"
        tvThank.text="Thank You!"
    }
}