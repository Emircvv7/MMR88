package com.example.mmr88
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataList = listOf("Football", "Basketball", "Volleyball", "Box", "Tennis", "Bouling", "Baseball", "Cricket", "Hockey", "Jump", "Sprint")

        val recyclerView: RecyclerView = view.findViewById(R.id.rv_sport)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = SportAdapter(dataList)
        recyclerView.adapter = adapter
    }
}
