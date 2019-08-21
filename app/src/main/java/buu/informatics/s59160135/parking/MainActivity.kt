package buu.informatics.s59160135.parking

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


var id1 =""
var brand1 =""
var name1 =""

var id2 =""
var brand2 =""
var name2 =""

var id3 =""
var brand3 =""
var name3 =""

var i = 0

class MainActivity : AppCompatActivity() {



    @SuppressLint("ResourceAsColor")
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

        b1.setText(id1)
        b2.setText(brand1)
        b3.setText(name1)

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

        b1.setText(id2)
        b2.setText(brand2)
        b3.setText(name2)

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

        b1.setText(id3)
        b2.setText(brand3)
        b3.setText(name3)

        b1.visibility = View.VISIBLE
        b2.visibility = View.VISIBLE
        b3.visibility = View.VISIBLE

        confirm.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
    }

    private fun confirm(view: View){
        val id = findViewById<EditText>(R.id.block1_edit)
        val brand = findViewById<EditText>(R.id.block2_edit)
        val name = findViewById<EditText>(R.id.block3_edit)

        if(i == 1){
            id1 = id.text.toString()
            brand1 = brand.text.toString()
            name1 = name.text.toString()

            if(id1.isEmpty()){
                b1_button.text = "Free"
            }else {
                b1_button.text = id1
            }
        }
        if(i == 2){
            id2 = id.text.toString()
            brand2 = brand.text.toString()
            name2 = name.text.toString()

            if(id2.isEmpty()){
                b2_button.text = "Free"
            }else {
                b2_button.text = id2
            }
        }
        if(i == 3){
            id3 = id.text.toString()
            brand3 = brand.text.toString()
            name3 = name.text.toString()

            if(id3.isEmpty()){
                b3_button.text = "Free"
            }else {
                b3_button.text = id3
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

    @SuppressLint("ResourceAsColor")
    private fun cancel(view : View){
        findViewById<EditText>(R.id.block1_edit).visibility = View.GONE
        findViewById<EditText>(R.id.block2_edit).visibility = View.GONE
        findViewById<EditText>(R.id.block3_edit).visibility = View.GONE
        findViewById<Button>(R.id.confirm_button).visibility = View.GONE
        findViewById<Button>(R.id.delete_button).visibility = View.GONE
        findViewById<Button>(R.id.cancel_button).visibility = View.GONE
    }
}
