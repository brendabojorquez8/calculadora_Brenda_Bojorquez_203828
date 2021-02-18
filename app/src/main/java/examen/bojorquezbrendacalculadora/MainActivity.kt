package examen.bojorquezbrendacalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtResult: TextView = findViewById(R.id.txtResult)
        val txtOperation:TextView = findViewById(R.id.txtOperation)
        val btn0: TextView = findViewById(R.id.btn0)
        val btn1: TextView = findViewById(R.id.btn1)
        val btn2: TextView = findViewById(R.id.btn2)
        val btn3: TextView = findViewById(R.id.btn3)
        val btn4: TextView = findViewById(R.id.btn4)
        val btn5: TextView = findViewById(R.id.btn5)
        val btn6: TextView = findViewById(R.id.btn6)
        val btn7: TextView = findViewById(R.id.btn7)
        val btn8: TextView = findViewById(R.id.btn8)
        val btn9: TextView = findViewById(R.id.btn9)
        val btnPlus: TextView = findViewById(R.id.btnPlus)
        val btnMinus: TextView = findViewById(R.id.btnMinus)
        val btnMult: TextView = findViewById(R.id.btnMult)
        val btnDiv: TextView = findViewById(R.id.btnDiv)
        val btnDot: TextView = findViewById(R.id.btnDot)
        val btnCE: TextView = findViewById(R.id.btnCE)
        val btnEquals: TextView = findViewById(R.id.btnEquals)
        val btnBack: ImageView = findViewById(R.id.btnBack)



        btn0.setOnClickListener { appendOnOperation("0", true, txtResult, txtOperation) }
        btn1.setOnClickListener { appendOnOperation("1", true, txtResult, txtOperation) }
        btn2.setOnClickListener { appendOnOperation("2", true, txtResult, txtOperation) }
        btn3.setOnClickListener { appendOnOperation("3", true, txtResult, txtOperation) }
        btn4.setOnClickListener { appendOnOperation("4", true, txtResult, txtOperation) }
        btn5.setOnClickListener { appendOnOperation("5", true, txtResult, txtOperation) }
        btn6.setOnClickListener { appendOnOperation("6", true, txtResult, txtOperation) }
        btn7.setOnClickListener { appendOnOperation("7", true, txtResult, txtOperation) }
        btn8.setOnClickListener { appendOnOperation("8", true, txtResult, txtOperation) }
        btn9.setOnClickListener { appendOnOperation("9", true, txtResult, txtOperation) }
        btnDot.setOnClickListener { appendOnOperation(".", true, txtResult, txtOperation) }

        //Operators
        btnPlus.setOnClickListener { appendOnOperation("+", false, txtResult, txtOperation) }
        btnMinus.setOnClickListener { appendOnOperation("-", false, txtResult, txtOperation) }
        btnMult.setOnClickListener { appendOnOperation("*", false, txtResult, txtOperation) }
        btnDiv.setOnClickListener { appendOnOperation("/", false, txtResult, txtOperation) }

        btnCE.setOnClickListener {
            txtOperation.text = ""
            txtResult.text = ""
        }

        btnBack.setOnClickListener {
            val string = txtOperation.text.toString()
            if(string.isNotEmpty()){
                txtOperation.text = string.substring(0,string.length-1)
            }
            txtOperation.text = ""
        }

        btnEquals.setOnClickListener {

                val operation: String = txtOperation.text.toString()
               // val num1: Double = BigDecimal.valueOf(operation.substring(0,operation.indexOf('')))


        }

    }

    fun appendOnOperation(string: String, boolean: Boolean, txtResult: TextView, txtOperation:TextView) {

        if(txtResult.text.isNotEmpty()){
            txtOperation.text = ""
        }

        if (boolean) {
            txtResult.text = ""
            txtOperation.append(string)
        } else {
            txtOperation.append(txtResult.text)
            txtOperation.append(string)
            txtResult.text = ""
        }
    }
}