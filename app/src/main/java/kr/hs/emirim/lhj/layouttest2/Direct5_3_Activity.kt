package kr.hs.emirim.lhj.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class Direct5_3_Activity : AppCompatActivity() {
    lateinit var edit:EditText
    lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear = LinearLayout(this)
        linear.orientation= LinearLayout.VERTICAL
        val params= LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear,params)

        edit=EditText(this)
        edit.hint="Enter any text"
        linear.addView(edit)

        var btn= Button(this)
        btn.text="버튼입니다"
        btn.setBackgroundColor(Color.rgb(0,100,255))
        linear.addView(btn)

         text=TextView(this)
        text.text="Part of result"
        text.setTextColor(Color.rgb(128,0,128))
        linear.addView(text)
        btn.setOnClickListener{
           text.text=edit.text
        }
    }
}