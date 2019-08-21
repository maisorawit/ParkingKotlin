package buu.informatics.s59160135.parking

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


var a1 =""
var a2 =""
var a3 =""

var s1 =""
var s2 =""
var s3 =""

var d1 =""
var d2 =""
var d3 =""

var i = 0

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.b1_button).setOnClickListener{
            i = 1
            btt1(it)
        }
        findViewById<Button>(R.id.b2_button).setOnClickListener{
            i = 2
            btt2(it)
        }
        findViewById<Button>(R.id.b3_button).setOnClickListener{
            i = 3
            btt3(it)
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

    private fun btt1(view : View) {
        val b1 = findViewById<EditText>(R.id.block1_edit)
        val b2 = findViewById<EditText>(R.id.block2_edit)
        val b3 = findViewById<EditText>(R.id.block3_edit)
        val confirm = findViewById<Button>(R.id.confirm_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)

        b1.setText(a1)
        b2.setText(a2)
        b3.setText(a3)

        b1.visibility = View.VISIBLE
        b2.visibility = View.VISIBLE
        b3.visibility = View.VISIBLE

        confirm.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
    }

    private fun btt2(view : View) {
        val b1 = findViewById<EditText>(R.id.block1_edit)
        val b2 = findViewById<EditText>(R.id.block2_edit)
        val b3 = findViewById<EditText>(R.id.block3_edit)
        val confirm = findViewById<Button>(R.id.confirm_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)

        b1.setText(s1)
        b2.setText(s2)
        b3.setText(s3)

        b1.visibility = View.VISIBLE
        b2.visibility = View.VISIBLE
        b3.visibility = View.VISIBLE

        confirm.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
    }

    private fun btt3(view : View) {
        val b1 = findViewById<EditText>(R.id.block1_edit)
        val b2 = findViewById<EditText>(R.id.block2_edit)
        val b3 = findViewById<EditText>(R.id.block3_edit)
        val confirm = findViewById<Button>(R.id.confirm_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)

        b1.setText(d1)
        b2.setText(d2)
        b3.setText(d3)

        b1.visibility = View.VISIBLE
        b2.visibility = View.VISIBLE
        b3.visibility = View.VISIBLE


        confirm.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
    }

    private fun confirm(view: View){

        if(i == 1){
            val editText1 = findViewById<EditText>(R.id.block1_edit)
            val editText2 = findViewById<EditText>(R.id.block2_edit)
            val editText3 = findViewById<EditText>(R.id.block3_edit)

            a1 = editText1.text.toString()
            a2 = editText2.text.toString()
            a3 = editText3.text.toString()

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)

            if(a1.isEmpty()){
                b1_button.text = "Free"
            }else {
                b1_button.text = a1
            }
        }
        if(i == 2){
            val editText1 = findViewById<EditText>(R.id.block1_edit)
            val editText2 = findViewById<EditText>(R.id.block2_edit)
            val editText3 = findViewById<EditText>(R.id.block3_edit)

            s1 = editText1.text.toString()
            s2 = editText2.text.toString()
            s3 = editText3.text.toString()

            if(s1.isEmpty()){
                b2_button.text = "Free"
            }else {
                b2_button.text = s1
            }
        }
        if(i == 3){
            val editText1 = findViewById<EditText>(R.id.block1_edit)
            val editText2 = findViewById<EditText>(R.id.block2_edit)
            val editText3 = findViewById<EditText>(R.id.block3_edit)

            d1 = editText1.text.toString()
            d2 = editText2.text.toString()
            d3 = editText3.text.toString()

            if(d1.isEmpty()){
                b3_button.text = "Free"
            }else {
                b3_button.text = d1
            }
        }

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
