package buu.informatics.s59160135.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.confirm_button).setOnClickListener{
            add(it)
        }

    }

    private fun add(view: View){
        val editText1 = findViewById<EditText>(R.id.block1_edit)
        val editText2 = findViewById<EditText>(R.id.block2_edit)
        val editText3 = findViewById<EditText>(R.id.block3_edit)

    }
}
