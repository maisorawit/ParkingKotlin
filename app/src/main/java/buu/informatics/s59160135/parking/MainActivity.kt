package buu.informatics.s59160135.parking

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


var a1 =""
var a2 =""
var a3 =""

var b1 =""
var b2 =""
var b3 =""

var c1 =""
var c2 =""
var c3 =""


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.b1_button).setOnClickListener{
            btt(it)
        }
        findViewById<Button>(R.id.b2_button).setOnClickListener{
            btt(it)
        }
        findViewById<Button>(R.id.b3_button).setOnClickListener{
            btt(it)
        }

        findViewById<Button>(R.id.confirm_button).setOnClickListener{
            confirm(it)
        }

        findViewById<Button>(R.id.delete_button).setOnClickListener{
            delete(it)
        }

        findViewById<Button>(R.id.cancel_button).setOnClickListener{
            cancel(it)
        }


    }

    private fun btt(view : View) {
        val b1 = findViewById<EditText>(R.id.block1_edit)
        val b2 = findViewById<EditText>(R.id.block2_edit)
        val b3 = findViewById<EditText>(R.id.block3_edit)
        val confirm = findViewById<Button>(R.id.confirm_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)

        b1.visibility = View.VISIBLE
        b2.visibility = View.VISIBLE
        b3.visibility = View.VISIBLE

        confirm.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
    }


    private fun confirm(view: View){

        val editText1 = findViewById<EditText>(R.id.block1_edit)
        val editText2 = findViewById<EditText>(R.id.block2_edit)
        val editText3 = findViewById<EditText>(R.id.block3_edit)

        editText1.text = editText1.text
        editText2.text = editText2.text
        editText3.text = editText3.text

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delete(view : View) {
        val editText1 = findViewById<EditText>(R.id.block1_edit)
        val editText2 = findViewById<EditText>(R.id.block2_edit)
        val editText3 = findViewById<EditText>(R.id.block3_edit)

        editText1.text.clear()
        editText2.text.clear()
        editText3.text.clear()
    }

    private fun cancel(view : View){
        findViewById<EditText>(R.id.block1_edit).visibility = View.GONE
        findViewById<EditText>(R.id.block2_edit).visibility = View.GONE
        findViewById<EditText>(R.id.block3_edit).visibility = View.GONE
        findViewById<Button>(R.id.confirm_button).visibility = View.GONE
        findViewById<Button>(R.id.delete_button).visibility = View.GONE
        findViewById<Button>(R.id.cancel_button).visibility = View.GONE
    }

}
