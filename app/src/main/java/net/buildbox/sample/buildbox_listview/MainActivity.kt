package net.buildbox.sample.buildbox_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeListView()
    }

    private fun initializeListView() {
        val pokemonNames = listOf("フシギダネ", "フシギソウ", "フシギバナ",
                "メガフシギバナ", "ヒトカゲ", "リザード", "リザードン", "メガリザードンX",
                "メガリザードンY", "ゼニガメ", "カメール", "カメックス", "メガカメックス", "キャタピー",
                "トランセル", "バタフリー", "メガスピアー", "ポッポ")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, pokemonNames)

        val listView: ListView = findViewById(R.id.list_view)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, _, position, _ ->
            val pokemonName = adapterView.getItemAtPosition(position) as String
            Toast.makeText(this, "$pokemonName が現れた！", Toast.LENGTH_SHORT).show()
        }
    }
}
