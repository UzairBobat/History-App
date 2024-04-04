package com.example.historyapp
//Uzair Bobat
//ST10441225
//Youtube Video Link:
//https://youtube.com/shorts/c8cFItklf6s?feature=share

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //initialise
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val famouspersonName = when (age) {
                    96 -> "Queen Elizabeth II: Queen Elizabeth II became the longest-reigning monarch in British history on September 9,2015,surpassing the record previously held by her great-great-grandmother,Queen Victoria."
                    46 -> "John F. Kennedy: John F. Kennedy was the youngest man ever elected to the presidency of the United States at the age of 43."
                    95 -> "Nelson Mandela: Nelson Mandela, a global symbol of resilience and reconciliation, spent 27 years in prison before becoming South Africa's first black president."
                    52 -> "William Shakespeare, widely regarded as the greatest writer in the English language, penned 37 plays and 154 sonnets during his lifetime, showcasing his profound impact on literature and drama."
                    76 -> "Albert Einstein, renowned physicist, revolutionized our understanding of the universe with his theory of relativity, which reshaped fundamental concepts of space, time, and gravity."
                    56 -> "Steve Jobs, the co-founder of Apple Inc., revolutionized technology and design with his visionary leadership and iconic products like the iPhone and MacBook."
                    36 -> "Princess Diana: Princess Diana was the first wife of Charles, Prince of Wales, who is the heir apparent to the British throne, making her the first British woman to marry the heir apparent in over 300 years."
                    39 -> "Martin Luther King Jr.: Martin Luther King Jr. was the youngest person to receive the Nobel Peace Prize in 1964 for his nonviolent resistance to racial prejudice in America."
                    37 -> "Vincent van Gogh: Vincent van Gogh only sold one painting during his lifetime, \"The Red Vineyard,\" which was bought by Anna Boch, a Belgian collector."
                    50 -> "Michael Jackson: Michael Jackson's moonwalk, debuted during his performance of \"Billie Jean\" on Motown 25: Today, Forever in 1983, became one of the most iconic dance moves in history, revolutionizing the art of dance."
                    else -> null
                }

                val message = if (famouspersonName != null) "You are the same age as $famouspersonName."
                else "No famous person found with the entered age."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}