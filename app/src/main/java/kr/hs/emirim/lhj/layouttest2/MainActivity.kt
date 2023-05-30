package kr.hs.emirim.lhj.layouttest2

import android.app.ActionBar.LayoutParams
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear1 = LinearLayout(this)
        linear1.orientation=LinearLayout.VERTICAL
        linear1.setBackgroundColor(Color.rgb(0,255,100))
        val params= LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1,params)

    }
}