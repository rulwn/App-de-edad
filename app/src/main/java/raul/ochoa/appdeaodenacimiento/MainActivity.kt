package raul.ochoa.appdeaodenacimiento

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtano  = findViewById<EditText>(R.id.txtano)
        val txtRes  = findViewById<TextView>(R.id.txtRes)
        val btnCalcular  = findViewById<Button>(R.id.btnCalcular)

        val objEdad = Edad()
        btnCalcular.setOnClickListener {
            val res = objEdad.Calcular(txtano.text.toString().toInt())
            txtRes.text = "Usted tiene $res años"
        }

    }
}