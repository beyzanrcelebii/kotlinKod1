package com.beyzanurcelebi.ilkproje

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.beyzanurcelebi.ilkproje.R.id.textView
import com.beyzanurcelebi.ilkproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //xml'in adi activity_main oldugu icin farkli ada burasi da degisir








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //koddan aktivity maindeki gorsele nasil erisebiliriz

       /* val image = findViewById<ImageView>(R.id.imageView) //bu yol cok tercih edilmez view binding onerilir
        //resmi degistirelim
        image.setImageResource(R.drawable.kedi2)
        //text'e eriselim

        val myText = findViewById<TextView>(textView)

        //text"in icerigini degistirelim

        myText.text = "merhaba kotlin"  */



    // view binding gradledan yapilir. gradle projeyi derler toplar calistirir
         /*her projeyi actitgimizda gradle modulede adroid yazan yere bunu kopyalayacagiz

        buildFeatures{
            viewBinding = true
        }

        sonra sag ustte sync now(senkronize et) yazacak onu etkinlestir

    */

        // text'i degistirme
        binding.textView.text = "Merhaba Beyza"
        //resmi degistirme
        binding.imageView.setImageResource(R.drawable.kedi2)

//        //butona tiklandiginda yazacak sey
//        binding.button.setOnClickListener {
//
//            binding.textView.text = "Butona Tiklandi"
//
//        }



    }


    //butonlara bastigimizda ekrana ne yazilicak
    fun kaydet(view : View) { //1.buton

    //import class view  Alt enter
    binding.textView.text= "kayit edildi"

    }


    fun iptal(view: View){ //2.buton
    binding.textView.text="kayit edilmedi"


    }













}