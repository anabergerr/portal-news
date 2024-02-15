package com.example.portalhtk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsFragment: Fragment() {

    private  lateinit var mRecycleView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mRecycleView = view.findViewById(R.id.news_recycler_view)
        mRecycleView.layoutManager = LinearLayoutManager(context)
    }

    override fun onStart() {
        super.onStart()
        val newsAdapter = NewsAdapter(NewsDatabase.findAll())
        mRecycleView.adapter = newsAdapter
        newsAdapter.notifyDataSetChanged()
    }
}