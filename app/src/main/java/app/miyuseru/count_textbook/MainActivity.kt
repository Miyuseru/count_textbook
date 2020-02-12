package app.miyuseru.count_textbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number: Int = 0
    var number2: Int = 0
    var number3: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text ="0"
        textView2.text ="0"
    }

    fun add(view: View?){
        number++
        textView.text = number.toString()
    }

    fun add2(view: View?){
        number2--
        textView2.text = number2.toString()
    }

    fun add3(view: View?){
        number3 = number + number2
        textView3.text = number3.toString()
    }


}
